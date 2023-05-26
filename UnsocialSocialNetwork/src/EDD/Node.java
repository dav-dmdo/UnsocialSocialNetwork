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
       * GETTERS AND SETTERS
       */
      
      
        
    
}