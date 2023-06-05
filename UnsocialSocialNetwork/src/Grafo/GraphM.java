/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import ImportantClasses.Friendship;
import ImportantClasses.User;

/**
 *
 * @author david
 */
public class GraphM {

    private GraphNode pFirst;
    private GraphNode pLast;
    private int numNodes;
    private int numEdges;

    public GraphM() {

        this.pFirst = null;
        this.pLast = null;
        this.numNodes = 0;
        this.numEdges = 0;
    }

    public boolean isEmpty() {
        return this.getpFirst() == null;
    }

    private void indexing() {
        int counter = 0;
        GraphNode gn = this.pFirst;
        while (gn != null) {
            gn.setIndex(counter++);
            gn = gn.getpNext();
        }
    }

    public boolean existsNodeID(int userID) {
        boolean exists = false;
        if (!isEmpty()) {
            GraphNode current = this.pFirst;
            while ((current != null) && (!exists)) {
                exists = (current.getUser().getUserID() == userID);
                current = current.getpNext();
            }
        }
        return exists;
    }

    public boolean existsNodeID(String userNickname) {
        boolean exists = false;
        if (!isEmpty()) {
            GraphNode current = this.pFirst;
            while ((current != null) && (!exists)) {
                exists = (current.getUser().getUserName().equalsIgnoreCase(userNickname));
                current = current.getpNext();
            }
        }
        return exists;
    }

    public boolean existsNodeUser(User user) {
        boolean exists = false;
        if (!isEmpty()) {
            GraphNode current = this.pFirst;
            while ((current != null) && (!exists)) {
                exists = (current.getUser().toString().equals(user.toString()));
                current = current.getpNext();
            }
        }
        return exists;
    }

    public void newEdge(Friendship friendship) {
        if ((existsNodeID(friendship.getUser1ID())) && (existsNodeID(friendship.getUser2ID()))) {
            GraphNode pUser1 = this.pFirst;
            GraphNode pUser2 = this.pFirst;

            while ((pUser1.getUser().getUserID() != friendship.getUser1ID()) || (pUser2.getUser().getUserID() != friendship.getUser2ID())) {
                if (pUser1.getUser().getUserID() != friendship.getUser1ID()) {
                    pUser1 = pUser1.getpNext();
                }
                if (pUser2.getUser().getUserID() != friendship.getUser2ID()) {
                    pUser2 = pUser2.getpNext();
                }
            }
            pUser1.getList().newAdjacency(pUser2, friendship.getTime());
            pUser2.getList().newAdjacency(pUser1, friendship.getTime());
            numEdges++;
        }
    }

    public void newNode(User user) {
        if (!existsNodeID(user.getUserID())) {
            GraphNode newNode = new GraphNode(user);
            if (isEmpty()) {
                this.pFirst = this.pLast = newNode;
            } else {
                if (user.toString().compareTo(this.pFirst.getUser().toString()) <= 0) {
                    newNode.setpNext(this.pFirst);
                    this.pFirst = newNode;
                } else if (user.toString().compareTo(this.getpLast().getUser().toString()) >= 0) {
                    this.pLast.setpNext(newNode);
                    this.pLast = newNode;
                } else {
                    GraphNode previous = this.pFirst;
                    GraphNode current = this.pFirst.getpNext();
                    while (user.toString().compareTo(current.getUser().toString()) > 0) {
                        previous = current;
                        current = current.getpNext();
                    }
                    newNode.setpNext(current);
                    previous.setpNext(newNode);
                }
            }
            numNodes++;
            this.indexing();
        }
    }

    public void deleteNode(int userID) {
        if (existsNodeID(userID)) {
            GraphNode gnUser = this.pFirst;
            GraphNode gnPrevious = null;
            while (id(gnUser) != userID) {
                gnPrevious = gnUser;
                gnUser = gnUser.getpNext();
            }

            Edge aux = gnUser.getList().getpFirst();

            for (int i = 0; i < gnUser.getList().getSize(); i++) {
                while (aux != null) {
                    deleteEdge(userID, id(aux));
                    aux = gnUser.getList().getpFirst();

                }
                if (existsNodeID(userID)) {
                    gnUser = this.pFirst;
                    gnPrevious = null;
                    while (id(gnUser) != userID) {
                        gnPrevious = gnUser;
                        gnUser = gnUser.getpNext();
                    }

                }
                if (gnUser == this.pFirst) {

                    this.pFirst = gnUser.getpNext();
                } else {
                    gnPrevious.setpNext(gnUser.getpNext());
                }
                if (gnUser == this.pLast) {
                    this.pLast = gnPrevious;
                }
                gnUser.setpNext(null);

                numNodes--;

                this.indexing();

            }
        }
    }

    public void deleteEdge(int userID1, int userID2) {
        if (existsNodeID(userID1) && existsNodeID(userID2)) {

            GraphNode gnUser1 = this.pFirst;
            GraphNode gnUser2 = this.pFirst;

            while ((id(gnUser1) != userID1) || (id(gnUser2) != userID2)) {
                gnUser1 = (id(gnUser1) == userID1) ? gnUser1 : gnUser1.getpNext();
                gnUser2 = (id(gnUser2) == userID2) ? gnUser2 : gnUser2.getpNext();
            }
            gnUser1.getList().delete(userID2);
            gnUser2.getList().delete(userID1);
            numEdges--;
        }

    }

    public GraphNode searchByIndex(int index) {
        GraphNode gn = this.pFirst;
        boolean found = false;
        while ((gn != null) && (!found)) {
            found = (index == index(gn));
            if (!found) {
                gn = gn.getpNext();
            }
        }
        return gn;
    }

    private User user(GraphNode gn) {
        return gn.getUser();
    }

    private User user(Edge edge) {
        return edge.getDestination().getUser();
    }

    private int id(GraphNode gn) {
        return gn.getUser().getUserID();
    }

    private int id(Edge edge) {
        return edge.getDestination().getUser().getUserID();
    }

    private int index(GraphNode gn) {
        return gn.getIndex();
    }

    private int index(Edge edge) {
        return edge.getDestination().getIndex();
    }

    public String usersToString() {
        String users = "Usuarios\n";
        GraphNode temp = this.pFirst;
        while (temp != null) {
            users += user(temp).toString();
            temp = temp.getpNext();
        }
        return users;
    }

    public String friendshipsToString() {
        String friendships = "Relaciones\n";
        GraphNode temp = this.pFirst;
        while (temp != null) {

            Edge auxEdge = temp.getList().getpFirst();
            while (auxEdge != null) {
                String auxString = (id(temp) < id(auxEdge)) ? id(temp) + "," + id(auxEdge) + "," + auxEdge.getWeight() + "\n" : id(auxEdge) + "," + id(temp) + "," + auxEdge.getWeight() + "\n";
                friendships += (friendships.contains(auxString)) ? "" : auxString;
                auxEdge = auxEdge.getpNext();
            }

            temp = temp.getpNext();
        }
        return friendships;
    }

    @Override
    public String toString() {
        return usersToString() + friendshipsToString();
    }

    /**
     * @return the pFirst
     */
    public GraphNode getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(GraphNode pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public GraphNode getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(GraphNode pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the numNodes
     */
    public int getNumNodes() {
        return numNodes;
    }

    /**
     * @param numNodes the numNodes to set
     */
    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }
    
    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }
    

    /*
     */
 /*
    public void newEdge(User origin, User destination){
        if ((existsNodeUser(origin)) && (existsNodeUser(destination))){
            GraphNode position = this.getpFirst();
            while (!(position.getUser().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination);
        }
    }
     */
 /*
    public void newEdge(User origin, User destination, int weight){
        if ((existsNodeUser(origin)) && (existsNodeUser(destination))){
            GraphNode position = this.getpFirst();
            while (!(position.getUser().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination, weight);
        }
        
    }
     */

}
