/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo.Recorridos;

<<<<<<< HEAD
import EDD.Stack;
import Grafo.Edge;
import Grafo.Graph;
=======
import Grafo.GraphM;
>>>>>>> andrea
import Grafo.GraphNode;

/**
 *
 * @author david
 */
public class Explorer {
    
<<<<<<< HEAD
    public int DFS(Graph graph, GraphNode root, boolean[] discovered){
=======
    public void DFS(GraphM graph, GraphNode root){
        boolean discovered [][] = new boolean[2][graph.getNumNodes()];
>>>>>>> andrea
        
        int cantIslands = 0;        
        //if (!graph.isEmpty()){
        //    cantIslands = 1;}
                
        discovered [root.getIndex()] = true;                
        Edge edge = root.getList().getpFirst();        
        while (edge != null){
            if (!discovered[edge.getDestination().getIndex()]){             
                DFS(graph, edge.getDestination(), discovered);                
                System.out.println("---"+root.getUser().getUserID()+"---");        
            }
            edge = edge.getpNext();
        }
        for (int i = 0; i < discovered.length; i++) {
            if (!discovered[i]){
                cantIslands++;
                System.out.println("");
                DFS(graph, graph.searchByIndex(i), discovered);
            }
            
        }
        return cantIslands;
    }
        
    public int countIslands(Graph graph, GraphNode root, boolean[] discovered ){
        int cantIslands = 0;
        
        
        return cantIslands;     
              
               
    }
    
}
