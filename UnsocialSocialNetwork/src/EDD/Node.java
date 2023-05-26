/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Andrea
 * 
 */
public class Node <T> {
    private T data;
    private Node pNext;
    

     /**
     * CONSTRUCTOR
     */
    
    public Node(T data) {
        this.data = data;
        this.pNext=null;
        
    }//Cierre constructor vacio
        
    public Node(T data, Node pNext) {
        this.data = data;
        this.pNext = pNext;
       
    }//Cierre constructor

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Node getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
        
        
      /**
       * GETTERS AND SETTERS
       */
      
      
        
    
}