/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author david
 */
public class Edge {
    
    private Object destination;
    private int weight;
    private Edge pNext;
    
    public Edge(Object destination){
        this.destination = destination;
        this.pNext = null;        
    }
    
    public Edge(Object destination, int weight){
        this.weight = weight;
        this.destination = destination;
        this.pNext = null;        
    }

    /**
     * @return the destination
     */
    public Object getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Object destination) {
        this.destination = destination;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the pNext
     */
    public Edge getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Edge pNext) {
        this.pNext = pNext;
    }
    
    
}
