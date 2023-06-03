/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import EDD.List;

/**
 *
 * @author Andrea
 */
public class Vertex {
    private int data;
    private boolean visited;
    private List neighboors;

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the visited
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     * @return the neighboors
     */
    public List getNeighboors() {
        return neighboors;
    }

    /**
     * @param neighboors the neighboors to set
     */
    public void setNeighboors(List neighboors) {
        this.neighboors = neighboors;
    }
    
    
    
}
