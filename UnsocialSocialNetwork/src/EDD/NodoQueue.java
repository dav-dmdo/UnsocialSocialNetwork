package EDD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */

public class NodoQueue {
    private int data;
    private NodoQueue pNext;

    public NodoQueue(int data) {
        this.data = data;
        this.pNext= null;
    }
    
    

    public NodoQueue(int data, NodoQueue pNext) {
        this.data = data;
        this.pNext = pNext;
    }

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
     * @return the pNext
     */
    public NodoQueue getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoQueue pNext) {
        this.pNext = pNext;
    }
    
    
    
}
