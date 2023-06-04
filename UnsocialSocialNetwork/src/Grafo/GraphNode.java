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
public class GraphNode {
    

    private User user;
    private EdgeList list;
    private GraphNode pNext;
    private int index;
    
    public GraphNode(User user){
        this.user = user;
        this.list = new EdgeList();
        this.pNext = null;
        this.index = -1;
        
    }
    

    /**
     * @return the data
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the data to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the list
     */
    public EdgeList getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(EdgeList list) {
        this.list = list;
    }

    /**
     * @return the next
     */
    public GraphNode getpNext() {
        return pNext;
    }

    /**
     * @param pNext the next to set
     */
    public void setpNext(GraphNode pNext) {
        this.pNext = pNext;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
}
