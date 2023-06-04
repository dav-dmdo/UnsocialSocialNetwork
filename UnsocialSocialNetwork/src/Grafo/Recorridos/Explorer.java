/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo.Recorridos;


import EDD.Stack;
import Grafo.Edge;
import Grafo.GraphM;

import Grafo.GraphM;

import Grafo.GraphNode;

/**
 *
 * @author david
 */
public class Explorer {
    

    public int DFS(GraphM graph, GraphNode root, boolean[] discovered){

   
        
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
        
    public int countIslands(GraphM graph, GraphNode root, boolean[] discovered ){
        int cantIslands = 0;
        
        
        return cantIslands;     
              
               
    }
    
}
