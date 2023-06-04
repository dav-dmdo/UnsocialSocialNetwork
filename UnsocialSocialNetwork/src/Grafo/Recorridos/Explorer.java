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
    
    public void DFS2(GraphM graph, GraphNode root, boolean[] discovered, int islas){
                
        discovered [root.getIndex()] = true;                
        Edge edge = root.getList().getpFirst();        
        for (int i = 0; i < root.getList().getSize(); i++) {
            if (!discovered[edge.getDestination().getIndex()]){             
                DFS(graph, edge.getDestination(), discovered);                
                System.out.println("---"+root.getUser().getUserID()+"---");        
            }
            edge = edge.getpNext();
        }        
    }
        
    public int countIslands(GraphM graph, GraphNode root ){
        int cantIslands = 0;
        boolean [] discovered = new boolean[graph.getNumNodes()];
        
        for (int i = 0; i < discovered.length; i++) {
                DFS(graph, graph.searchByIndex(i), discovered);
            }           
                
        return cantIslands;     
              
               
    }
    
    
    public void DFS_programiz(GraphM g, GraphNode n, boolean [] visited){
        
        visited[n.getIndex()] = true;
        
        Edge adj = n.getList().getpFirst();
        for (int i = 0; i < n.getList().getSize(); i++) {
            if (!visited[adj.getDestination().getIndex()]){
                DFS_programiz(g, adj.getDestination(), visited);
                System.out.println(n.getUser().getUserID());
            }
            adj = adj.getpNext();
        }
        
        
    }
    
    public void completeDFS(GraphM g){
        boolean [] visited = new boolean [g.getNumNodes()];
        GraphNode n = g.getpFirst();
        
        for (int i = 0; i < g.getNumNodes(); i++) {
            if (!visited[n.getIndex()]){
                DFS_programiz(g, n, visited);
                System.out.println("---");
            }
            n = n.getpNext();
            
        }
    }
}
