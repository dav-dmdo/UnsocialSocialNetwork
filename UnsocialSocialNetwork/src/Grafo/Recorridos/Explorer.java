/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo.Recorridos;


import EDD.Stack;
import FileManagement.FileManager;
import Grafo.Edge;
import Grafo.GraphM;

import Grafo.GraphM;

import Grafo.GraphNode;

/**
 *
 * @author david
 */
public class Explorer {  
    
        public void DFS(GraphM g, GraphNode n, boolean [] visited, PathAndIslands PI){
        
        visited[n.getIndex()] = true;
        PI.path+= n.getUser().getUserID()+"-";
        System.out.println(n.getUser().getUserID());
        Edge adj = n.getList().getpFirst();
        for (int i = 0; i < n.getList().getSize(); i++) {
            if (!visited[adj.getDestination().getIndex()]){
                DFS(g, adj.getDestination(), visited, PI);
            }
            adj = adj.getpNext();
        }
        
        
    }
    
    public PathAndIslands completeDFS(GraphM g){
        boolean [] visited = new boolean [g.getNumNodes()];
        GraphNode n = g.getpFirst();
        PathAndIslands PI = new PathAndIslands();
        
        for (int i = 0; i < g.getNumNodes(); i++) {
            if (!visited[n.getIndex()]){
                DFS(g, n, visited, PI);
                System.out.println("---");
                PI.numIslands++;
            }
            n = n.getpNext();
            
        }
        return PI;
    }
    
    public void findBridgesDFS(GraphM g){
        FileManager fm = new FileManager();
        fm.writeDBtxt(g);
        GraphM grafo = fm.readDBtxt();
        PathAndIslands piOriginal = completeDFS(g);
        
        boolean [] deleted = new boolean[grafo.getNumEdges()/2];
        
        
        
        
        
        
    }
}
