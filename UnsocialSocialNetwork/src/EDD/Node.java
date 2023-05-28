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
public class Node {
    private String usuario;
    private int usuarioNum;
    private Node pNext;
    

     /**
     * CONSTRUCTOR
     */
    
    public Node(String data, int number) {
        this.usuario = data;
        this.pNext = null;
        this.usuarioNum= number;
    }//Cierre constructor vacio
        
    public Nodo(String data, Nodo pNext, int number) {
        this.usuario = data;
        this.pNext = pNext;
        this.usuarioNum= number;
    }//Cierre constructor
        
        
      /**
       * GETTERS AND SETTERS
       */
      
      
        
    

    /**
     * @return the data
     */
    public String getData() {
        return usuario;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
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
