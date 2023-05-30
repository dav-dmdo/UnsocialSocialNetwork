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

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
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
    private String userName;
    private int userId;
    private Node pNext;
    

     /**
     * CONSTRUCTOR
     */
    
    public Node(String data, int number) {
        this.userName = data;
        this.pNext = null;
        this.userId= number;
    }//Cierre constructor vacio
        
    public Node(String data, Node pNext, int number) {
<<<<<<< HEAD
        this.userName = data;
=======
        this.usuario = data;
>>>>>>> origin/david
        this.pNext = pNext;
        this.userId= number;
    }
        
        
    public Node() {
        this.userName = "";
        this.pNext = pNext;
        this.userId= 0;
    }//Cierre constructor
        
        
      /**
       * GETTERS AND SETTERS
       */
      
      
        

<<<<<<< HEAD
=======
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
    public Node getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }
>>>>>>> origin/david
    
   
    
    
}
