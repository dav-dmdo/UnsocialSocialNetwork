/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import FileManagement.FileManager;


import Grafo.Recorridos.Explorer;

import Grafo.GraphM;
import Grafo.Recorridos.PathAndIslands;

import ImportantClasses.Friendship;
import ImportantClasses.User;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        


        App app = new App();
        app.start();
    }}
//
//        GraphM grafo = new GraphM();            
//        FileManager fileManager = new FileManager();
//        Explorer explorer = new Explorer();     
//        PathAndIslands PI = new PathAndIslands();
//        
//        grafo = fileManager.readDBtxt();
//        
//        System.out.println(grafo.toString());
//        
//        
//        fileManager.writeDBtxt(grafo);
//        
//        
        //boolean [] visited = new boolean[grafo.getNumNodes()];
        //explorer.DFS_programiz(grafo, grafo.getpFirst(), visited);
        //System.out.println("La cantidad de islas es:"+ cant);
        
//        PI = explorer.completeDFS(grafo);
//        
//        System.out.println(PI.path + "|||" + PI.numIslands);
//        
//        explorer.findBridgesDFS(grafo);
//
//
//
//    }
    
//}
