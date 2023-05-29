/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo.Recorridos;

////import EDD.Node;
////import EDD.NodoEDD;
import EDD.Queue;
import EDD.Stack;

import Grafo.EdgeList;
import Grafo.Graph;
import Grafo.Vertex;

/**
 *
 * @author Andrea
 */
/**
 * This reads your graph using Breadth First Search.
 *
 * @author Andrea
 */
public class Recorridos {

    /**
     * This reads your graph using Depth First Search.
     *
     * @author Andrea
     * @param grafo
     * @param v
     * @param visited
     * @param edges
     * @return String
     */
//    public String DFS(Graph grafo, int v, boolean[] visited, EdgeList edges) {
//       String visitedBFS = " ";
//
//        visited[v] = true;
//        visitedBFS += v + ", ";
//        for (int i = 0; i < grafo.getSize(); i++) {
//            if (v != i && !visited[i] && edges.isAdjacent(i)) {
//                DFS(grafo, i, visited, edges);
//            }
//
//        }
//        return visitedBFS;
//    }

        public void DFS(Vertex v){
            Stack stack = new Stack();
            stack.pile(v);
            while(!stack.isEmpty()){
            int current = stack.unpile().getData();
            
            current.}
            
        }
    /**
     * This makes a Breadth First Search of your graph.
     *
     * @param g
     * @param edges
     * @return
     */
    public String BFS(Graph g, EdgeList edges) {
        String visitedDFS = "";
        Queue queue = new Queue();
        boolean visited[] = new boolean[g.getSize()];
        int currentV;
        for (int i = 0; i < g.getSize(); i++) {
            visited[i] = false;

        }
        for (int i = 0; i < g.getSize(); i++) {
            if (!visited[i]) {
                queue.addQueue(i);
                visited[i] = true;
                while (!queue.isEmpty()) {
                    currentV = queue.deQueue().getData();
                    visitedDFS += currentV + ", ";
                    for (int j = 0; j < g.getSize(); j++) {
                        if (currentV != j && edges.isAdjacent(currentV) && !visited[j]) {
                            queue.addQueue(j);
                            visited[j] = true;

                        }
                    }
                }

            }

        }

        return visitedDFS;
    }
}
