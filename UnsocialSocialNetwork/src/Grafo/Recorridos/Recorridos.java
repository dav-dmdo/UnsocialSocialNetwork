/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo.Recorridos;

import EDD.Node;
import EDD.Queue;
import Grafo.EdgeList;
import Grafo.Graph;

/**
 *
 * @author Andrea
 */

/**
 * This reads your graph using Breadth First Search.
 * @author Princ
 */
public class Recorridos {
    
    /**
 * This reads your graph using Breadth First Search.
 * @author Princ
     * @param grafo
     * @param v
     * @param visited
     * @param edges
     * @return String
 */
    public String BFS(Graph grafo, int v, boolean [] visited, EdgeList edges){
    String visitedBFS = "";
    visited [v] = true;
    visitedBFS += v;
        for (int i = 0; i < grafo.getSize(); i++) {
            if (v != i && !visited[i] && edges.isAdjacent(i) ) {
                BFS(grafo, i, visited, edges);
            }
            
        }
    return visitedBFS;}
    
    public String DFS(Graph g, EdgeList edges){
    String visitedDFS = "";
    Queue queue = new Queue();
    boolean visited []= new boolean[g.getSize()];
    int currentV;
        for (int i = 0; i < g.getSize(); i++) {
            visited[i] =false;
            
        }
        for (int i = 0; i < g.getSize(); i++) {
            if (!visited[i]) {
                Node nodo = new Node(i);
                queue.addQueue(i);
                
                
            }
            
        }
    
    return visitedDFS;
    } 
}
