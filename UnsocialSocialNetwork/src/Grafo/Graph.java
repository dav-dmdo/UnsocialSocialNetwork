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
public class Graph {
    
    private GraphNode pFirst;
    private GraphNode pLast;
    private int size;
    
    public Graph(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.getpFirst() == null;
    }
    
    
    public boolean existsNodeID(int userID){
        boolean exists = false;
        if (!isEmpty()){
            GraphNode current = this.getpFirst();
            while ((current != null) && (!exists)){
                exists = (current.getUser().getUserID() == userID);
                current = current.getpNext();
            }            
        }
        return exists;
    }
    
    public boolean existsNodeUser(User user){
        boolean exists = false;
        if (!isEmpty()){
            GraphNode current = this.getpFirst();
            while ((current != null) && (!exists)){
                exists = (current.getUser().toString().equals(user.toString()));
                current = current.getpNext();
            }            
        }
        return exists;
    }    
    
    public void newEdge(Friendship friendship){
        if ((existsNodeID(friendship.getUser1ID()))&& (existsNodeID(friendship.getUser2ID()))){
            GraphNode pUser1 = this.getpFirst();
            GraphNode pUser2 = this.getpFirst();
            
            while ((pUser1.getUser().getUserID() != friendship.getUser1ID()) || (pUser2.getUser().getUserID() != friendship.getUser2ID()) ){
                if (pUser1.getUser().getUserID() != friendship.getUser1ID()){
                    pUser1 = pUser1.getpNext();
                }
                if (pUser2.getUser().getUserID() != friendship.getUser2ID()){
                    pUser2 = pUser2.getpNext();
                }
            }
            pUser1.getList().newAdjacency(pUser2, friendship.getTime());
            pUser2.getList().newAdjacency(pUser1, friendship.getTime());            
        }       
    }
    
    public void newNode(User user){
        if  (!existsNodeID(user.getUserID())){
            GraphNode newNode = new GraphNode(user);
            if (isEmpty()){
                this.setpFirst(this.pLast=newNode);
            }else{
                if(user.toString().compareTo(this.getpFirst().getUser().toString()) <=0 ){
                    newNode.setpNext(this.getpFirst());
                    this.setpFirst(newNode);
                }else if(user.toString().compareTo(this.getpLast().getUser().toString()) >= 0){
                    this.getpLast().setpNext(newNode);
                    this.setpLast(newNode);                   
                }else{
                    GraphNode previous = this.getpFirst();
                    GraphNode current = this.getpFirst().getpNext();
                    while (user.toString().compareTo(current.getUser().toString()) > 0){
                        previous = current;
                        current = current.getpNext();
                    }
                    newNode.setpNext(current);
                    previous.setpNext(newNode);
                    
                }
            }
            this.setSize(this.getSize() + 1);
        }
    }
    
    
    public User user(GraphNode gn){
        return gn.getUser();
    }
    
    public User user(Edge edge){
        return edge.getDestination().getUser();
    }
    
    public int id(GraphNode gn){
        return gn.getUser().getUserID();
    }
    
    public int id(Edge edge){
        return edge.getDestination().getUser().getUserID();
    }
    
    
    public String usersToString(){
        String users = "Usuarios:\n";
        GraphNode temp = this.pFirst;
        while (temp != null){
            users+= user(temp).toString();
            temp = temp.getpNext();
        }
        return users;
    }
    
    public String friendshipsToString(){
        String friendships = "Relaciones:\n";
        GraphNode temp = this.pFirst;
        while (temp != null){
            
            Edge auxEdge = temp.getList().getpFirst();
            while (auxEdge != null){
                String auxString =(id(temp)<id(auxEdge)) ? id(temp) + "," + id(auxEdge)+ "," + auxEdge.getWeight() +"\n" : id(auxEdge) + "," + id(temp)+ "," + auxEdge.getWeight()+"\n";
                friendships += (friendships.contains(auxString)) ? "":auxString;
                auxEdge = auxEdge.getpNext();
            }           
            
            temp = temp.getpNext();
        }        
        return friendships;
    }
    
    @Override
    public String toString(){
        return usersToString()+friendshipsToString();
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
