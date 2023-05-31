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
    
    public boolean existsNode(User data){
        boolean exists = false;
        if (!isEmpty()){
            GraphNode current = this.getpFirst();
            while ((current != null) && (!exists)){
                exists = (current.getUser().toString().equals(data.toString()));
                current = current.getpNext();
            }            
        }
        return exists;
    }
    
    public void newEdge(User origin, User destination){
        if ((existsNode(origin)) && (existsNode(destination))){
            GraphNode position = this.getpFirst();
            while (!(position.getUser().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination);
        }
        
    }
    
    public void newEdge(User origin, User destination, int weight){
        if ((existsNode(origin)) && (existsNode(destination))){
            GraphNode position = this.getpFirst();
            while (!(position.getUser().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination, weight);
        }
        
    }
    
    public void newNode(User user){
        if  (!existsNode(user)){
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
    
    public String usersToString(){
        String users = "Usuarios:\n";
        GraphNode temp = this.pFirst;
        while (temp != null){
            users+= temp.getUser().toString();
            temp = temp.getpNext();
        }
        return users;
    }
    
    public String friendshipToString(){
        String friendships = "Relaciones:\n";
        
        return friendships;
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
    
    
}
