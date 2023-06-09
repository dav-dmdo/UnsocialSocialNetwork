/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import ImportantClasses.User;

/**
 *
 * @author david
 */
public class EdgeList {

    private Edge pFirst;
    private Edge pLast;
    private int size;

    public EdgeList() {
        this.pFirst = this.pLast = null;
        this.size = 0;
    }

    /**
     * This method checks if EdgeList attribute pFirst points to null
     *
     * @author david
     * @return found: boolean
     */
    public boolean isEmpty() {
        return this.pFirst == null;
    }

    /**
     * Checks if an Object is stored in the list.pCurrent is an Edge pointer
     * that will be going over the list. The loop will stop if pCurrent is null
     * or if the Edge was already in the list.
     *
     * @author david
     * @param userGN: GraphNode
     * @return found: boolean
     */
    public boolean isAdjacent(GraphNode userGN) {
        Edge pCurrent = this.pFirst;
        boolean found = false;
        while ((pCurrent != null) && !(userGN.equals(pCurrent.getDestination()))) {
            pCurrent = pCurrent.getpNext();
        }
        
        if (pCurrent != null) {
            found = true;
        }
        return found;

    }

    /**
     * Check if the relation exist. If not, then it will be added to the list.
     *
     * @author david
     * @param destination: Object
     */
    public void newAdjacency(GraphNode destination) {
        if (!isAdjacent(destination)) {
            Edge newEdge = new Edge(destination);
            add(newEdge, destination);
        }

    }

    /**
     *
     * @param destination
     * @param weight
     */
    public void newAdjacency(GraphNode destination, int weight) {
        if (!isAdjacent(destination)) {
            Edge newEdge = new Edge(destination, weight);
            add(newEdge, destination);
        }

    }

    /**
     *
     * @param edge
     * @param destination
     */
    public void add(Edge edge, GraphNode destination) {
        if (isEmpty()) {
            this.pFirst = edge;
            this.pLast = edge;
        } else {
            if (destination.getUser().getUserID() <= this.pFirst.getDestination().getUser().getUserID()) {
                edge.setpNext(this.pFirst);
                this.pFirst = edge;
            } else if (destination.getUser().getUserID() >= this.pLast.getDestination().getUser().getUserID()) {
                this.pLast.setpNext(edge);
                this.pLast = edge;
            } else {
                Edge previous = this.pFirst;
                Edge current = this.pFirst.getpNext();
                while (destination.getUser().getUserID() > current.getDestination().getUser().getUserID()) {
                    previous = current;
                    current = current.getpNext();
                }
                edge.setpNext(current);
                previous.setpNext(edge);
            }
        }
        this.size++;
    }

    public void delete(int id) {
        if (!isEmpty()) {
            boolean found = false;
            Edge current = this.pFirst;
            Edge previous = null;
            while ((current != null) && (!found)) {
                found = (current.getDestination().getUser().getUserID() == id);
                if (!found) {
                    previous = current;
                    current = current.getpNext();
                }
            }            
            if(current != null){
                if (current == this.pFirst){
                    this.pFirst = current.getpNext();                    
                } else {
                    previous.setpNext(current.getpNext());                    
                }
                if (current == this.pLast){
                    this.pLast = previous;
                }                
                current.setpNext(null);                
                this.size--;
            }
        }
    }

    /**
     *
     * @param edge
     * @param destination
     */
    public void add(Edge edge, User destination) {
        if (isEmpty()) {
            this.pFirst = edge;
            this.pLast = edge;
        } else {
            if (destination.toString().compareTo(this.pFirst.getDestination().toString()) <= 0) {
                edge.setpNext(this.pFirst);
                this.pFirst = edge;
            } else if (destination.toString().compareTo(this.pLast.getDestination().toString()) >= 0) {
                this.pLast.setpNext(edge);
                this.pLast = edge;
            } else {
                Edge previous = this.pFirst;
                Edge current = this.pFirst.getpNext();

                while (destination.toString().compareTo(current.getDestination().toString()) > 0) {
                    previous = current;
                    current = current.getpNext();
                }
                edge.setpNext(current);
                previous.setpNext(edge);
            }
        }

        this.size++;
    }

    /**
     * Checks if an Object is stored in the list. pCurrent is an Edge pointer
     * that will be going over the list. The loop will stop if pCurrent is null
     * or if the Edge was already in the list.
     *
     * @author david
     * @param user: User
     * @return found: boolean
     */
    public boolean isAdjacent(User user) {
        Edge pCurrent = this.pFirst;
        boolean found = false;
        while ((pCurrent != null) && !(user.toString().equals(pCurrent.getDestination().toString()))) {
            pCurrent = pCurrent.getpNext();
        }

        if (pCurrent != null) {
            found = true;
        }
        return found;

    }

    /*public void newAdjacency(User destination, int weight) {
        if (!isAdjacent(destination)) {
            Edge newEdge = new Edge(destination, weight);
            add(newEdge, destination);

        }*/
    /**
     * @return the pFirst
     */
    public Edge getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Edge pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Edge getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Edge pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
