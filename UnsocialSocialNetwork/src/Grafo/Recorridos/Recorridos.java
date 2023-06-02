/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo.Recorridos;

//import EDD.List;
import EDD.Queue;


import Grafo.EdgeList;
import Grafo.Graph;


/**
 *
 * @author Andrea
 */
/**
 * This reads your graph using Breadth First Search.
 *
 * @author Andrea
 */
//public class Recorridos {
    

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
    
    //NEEDS A METHOD THAT FINDS THE VERTEX, SO U CAN SEND THAT.
//    public Results DFS(Graph grafo, int v, boolean[] visited, EdgeList edges) {
//       String visitedDFS = " ";
//       Results response = new Results();
//       
//       int counter=0;
//       
//        if (visited == null) {
//            visited = new boolean[grafo.getSize()];
//            //Sets all the isles as no visited
//            for (int i = 0; i < grafo.getSize(); i++) {
//                visited[i]=false;
//                
//            }
//            visited[v] = true; //Sets the first vertex as visited
//        }
//        else{
//            for (int i = 0; i < visited.length; i++) {
//                if (visited[i] == visited[v]) {
//                    visited[v]= true; //Sets the origin as visited
//                    
//                }
//                
//            }
//}
//        counter ++;
//        //visitedDFS += v + "has been visited" + ". Isle count: " + Integer.toString(counter);
//        response.getListaDeIslasRecorridas().addLast(v);
//        
//        for (int i = 0; i < visited.length; i++) {
//            if (v != i && !visited[i] && edges.isAdjacent(i)){
//                DFS(grafo, i, visited, edges);
//                
//            }
//            
//}
       
       
//
//        visited[v] = true;
//        counter++;
//        visitedDFS += v + ", ";
//        for (int i = 0; i < grafo.getSize(); i++) {
//            
//            if (v != i && !visited[i] && edges.isAdjacent(i)) {
//                DFS(grafo, i, visited, edges);
//            }
//
//        }
//visitedDFS += "\nThe amount of isles if of " + Integer.toString(counter);

      //  return response;
    //}

    /**
     * This makes a Breadth First Search of your graph.
     *
     * @param g
     * @param edges
     * @return
     */
//    public Results BFS(Graph g, EdgeList edges) {
//        String visitedBFS = "";
//        Results response = new Results();
//        int counter = 0;
//        Queue queue = new Queue();
//        boolean visited[] = new boolean[g.getSize()];
//        int currentV;
//        for (int i = 0; i < g.getSize(); i++) {
//            visited[i] = false; //Sets all the isles as NO visited
//
//        }
//        for (int i = 0; i < g.getSize(); i++) {
//            if (!visited[i]) {
//                queue.addQueue(i); 
//                visited[i] = true; //sets vertex as visited
//                while (!queue.isEmpty()) {
//                    currentV = queue.deQueue().getData();
//                    counter ++;
//                    visitedBFS += currentV + ", ";
//                    response.getListaDeIslasRecorridas().addLast(currentV);
//                    
//                    for (int j = 0; j < g.getSize(); j++) {
//                        if (currentV != j && edges.isAdjacent(currentV)) && !visited[j]) {
//                            queue.addQueue(j);
//                            visited[j] = true;
//
//                        }
//                    }
//                }
//
//            }
//
//        }
//        //visitedBFS += "The final total of isles is equal to "+ Integer.toString(counter);
//
//        return response;
//    }
//    
//    public String BridgeChecker(Graph g, EdgeList edges){
//        String Bridge = "";
//        boolean[] visited = null;
//        
//        Results initial = DFS(g, 0, visited, edges );
//        int RealNumberOfIsles=initial.getSize();
//        for (int i = 0; i < g.getSize(); i++) {
//            //Remove node
//            Results current = DFS(g, i, visited, edges );
//            if (current.getSize() < RealNumberOfIsles) {
//                Bridge += i + " Is a bridge.";
//  
//                
//            }
//
//            
//       
//        
//    }
//        return Bridge;
//    }
//}
