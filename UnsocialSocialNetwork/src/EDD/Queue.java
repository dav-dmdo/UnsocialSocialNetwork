/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author Andrea Linares
 */
public class Queue {
    //ATRIBUTES
    private Node head;
    private Node tail;
    private int size;

    //CONSTRUCTOR
    /**
     * This is an empty constructor.
     */
    public Queue() {
       this.head = this.tail = null;
       this.size = 0;
    }//END OF CONSTRUCTOR
    
    //METHOD
    
    /**
     * Checks if this queue is empty.
     *
     * @return true if this stack is empty and false otherwise.
     */
    public boolean isEmpty(){
    return head==null;
    }
    
    /**
     * Empties a queue
     */
    public void empty(){
    this.head = this.tail = null;
    this.size = 0;
    }
    
    /**
     * Takes element out of queue (firs element added or head)
     */
    public void deQueue(){
        if (!this.isEmpty()) {
            if (size ==1) {
                this.empty();
                
            }else{
            head = head.getpNext();
            size--;}
            
        }
}

    /**
     * This adds an element to the queue receiving a node.
     * @param toAdd 
     */
    public void addQueue(Node toAdd) {
        if (this.isEmpty()) {
            this.head = this.tail = toAdd;

        } else {
            tail.setpNext(toAdd);
            tail = toAdd;
        }
        size++;
    }

   /**
    * This returns a string ready to print of the elements of a queue.
    * @return null if its empty and a string ready to print if its not.
    */
    public String printQueue() {
        if (!this.isEmpty()) {
            String toPrint = "";
            for (int i = 0; i < size; i++) {
                Node current = head;
                this.deQueue();
                toPrint += current.getData() + "--> ";
                this.addQueue(current);

            }
            return toPrint;

        }
        return null;
    }

//GETTERS AND SETTERS
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
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
