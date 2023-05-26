/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Andrea
 * @param <T>
 */
public class Nodo <T>{
    private T data;
    private Nodo pNext;
    //private Nodo pPrevious;

     /**
     * CONSTRUCTOR
     */
    
    public Nodo(T data) {
        this.data = data;
        this.pNext = null;}
        
    public Nodo(T data, Nodo pNext) {
        this.data = data;
        this.pNext = pNext;
        
        
      /**
       * GETTERS AND SETTERS
       */
      
      
        
    }

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
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
   
    
    
}
