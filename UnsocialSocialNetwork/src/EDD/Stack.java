/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Andrea
 */
public class Stack {
    //Atributes
    private Node top;
    private Node base;
    private int size;

     /**
     * CONSTRUCTORS 
     */
    
    //EMPTY CONSTRUCTOR
    public Stack() {
        this.top = this.base = null;
        this.size = 0;
    }//END OF EMPTY CONSTRUCTOR 
    
    
    public boolean isEmpty(){
        return getTop() == null;
    }

    /**
     * @return the top
     */
    public Node getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(Node top) {
        this.top = top;
    }

    /**
     * @return the base
     */
    public Node getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Node base) {
        this.base = base;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * GETTERS AND SETTERS
     */
    
    
    
   
    
    
    
}
