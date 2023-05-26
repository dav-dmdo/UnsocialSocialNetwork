/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author david
 */
public class EdgeList {
    
    private Edge pFirst;
    private Edge pLast;
    private int size;
   
    public EdgeList(){
        this.pFirst = this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.getpFirst() == null;
    }
    
    public boolean isAdjacent(Object data){
        Edge pCurrent = this.pFirst;
        boolean found = false;
        
        while ((pCurrent != null) && !(data.toString().equals(pCurrent.destination.toString()))){
            
        }
        
        
    }
    
    
    

    /**
     * @return the pFirst
     */
    public Edge getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Edge pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Edge getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Edge pLast) {
        this.pLast = pLast;
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
