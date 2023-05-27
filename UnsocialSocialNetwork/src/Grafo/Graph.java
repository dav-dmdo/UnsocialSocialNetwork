/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author david
 */
public class Graph {
    
    private GraphNode pFirst;
    private GraphNode pLast;
    private int size;
    
    public Graph(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    public boolean existsNode(Object data){
        boolean exists = false;
        if (!isEmpty()){
            GraphNode current = this.pFirst;
            while ((current != null) && (!exists)){
                exists = (current.getData().toString().equals(data.toString()));
                current = current.getpNext();
            }            
        }
        return exists;
    }
    
    public void newEdge(Object origin, Object destination){
        if ((existsNode(origin)) && (existsNode(destination))){
            GraphNode position = this.pFirst;
            while (!(position.getData().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination);
        }
        
    }
    
    public void newEdge(Object origin, Object destination, int weight){
        if ((existsNode(origin)) && (existsNode(destination))){
            GraphNode position = this.pFirst;
            while (!(position.getData().toString().equals(origin.toString()))){
                position = position.getpNext();
            }
            position.getList().newAdjacency(destination, weight);
        }
        
    }
    
    public void newNode(Object data){
        if  (!existsNode(data)){
            GraphNode newNode = new GraphNode(data);
            if (isEmpty()){
                this.pFirst=this.pLast=newNode;
            }else{
                if(data.toString().compareTo(this.pFirst.getData().toString()) <=0 ){
                    newNode.setpNext(this.pFirst);
                    this.pFirst = newNode;
                }else if(data.toString().compareTo(this.pLast.getData().toString()) >= 0){
                    this.pLast.setpNext(newNode);
                    this.pLast = newNode;                   
                }else{
                    GraphNode position = this.pFirst;
                    while ()
                }
            }
            this.size ++;
        }
    }
    
    
}
