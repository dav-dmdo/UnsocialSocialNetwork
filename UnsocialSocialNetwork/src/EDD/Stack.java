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

    //METHODS
    /**
     * Checks if this stack is empty.
     *
     * @return true if this stack is empty and false otherwise.
     */
    public boolean isEmpty() {
        return getTop() == null;
    }

    /**
     * Empties a stack
     */
    public void empty() {
        this.top = this.base = null;
        this.size = 0;
    }

    /**
     * Stacks in a pile receiving a Node
     *
     * @param nodo
     */
    public void stack(Node nodo) {
        if (this.isEmpty()) {
            top = base = nodo;
        } else {
            nodo.setpNext(top);
            top = nodo;
        }
        size++;
    }

    /**
     * Unstack the top element of the stack
     */
    public void unstack() {
        if (!this.isEmpty()) {
            if (size == 1) {
                this.empty();
            } else {
                top = top.getpNext();
                size--;
            }
        }
    }

    /**
     * This is a recursive method that returns a string ready to be shown.
     *
     * @param printStack
     * @return String
     */
    public String printList(String printStack) {
        String toPrint = "";
        if (!this.isEmpty()) {
            Node aux = top;
            this.unstack();
            toPrint += aux.getData() + "-->";
            toPrint = printList(toPrint);
            this.stack(aux);

        }
        return toPrint;
    }

    //GETTERS AND SETTERS
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

}
