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
    private T usuario;
    private int usuarioNum;
    private Nodo pNext;
    //private Nodo pPrevious;

     /**
     * CONSTRUCTOR
     */
    
    public Nodo(T data, int number) {
        this.usuario = data;
        this.pNext = null;
        this.usuarioNum= number;
    }
        
    public Nodo(T data, Nodo pNext, int number) {
        this.usuario = data;
        this.pNext = pNext;
        this.usuarioNum= number;
        
        
      /**
       * GETTERS AND SETTERS
       */
      
      
        
    }

    /**
     * @return the data
     */
    public T getData() {
        return usuario;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.usuario = data;
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
