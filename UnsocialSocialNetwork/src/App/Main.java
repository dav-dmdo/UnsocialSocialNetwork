/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import FileManagement.FileManager;


import Grafo.Recorridos.Explorer;

import Grafo.GraphM;

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
//
//        GraphM grafo = new Graph();
//        User david = new User(1, "@dmdo");
//        User moises = new User(2, "@dmdo");
//        User davila = new User(3, "@dmdo");
//        User ortiz = new User(4, "@dmdooo");
//        
//        grafo.newNode(david);
//        grafo.newNode(moises);
//        grafo.newNode(davila);
//        grafo.newNode(ortiz);
//        
//        Friendship friendship1 = new Friendship(david.getUserID(), moises.getUserID(), 12);
//        Friendship friendship2 = new Friendship(david.getUserID(), davila.getUserID(), 13);
//        Friendship friendship3 = new Friendship(david.getUserID(), ortiz.getUserID(),14);
//        Friendship friendship4 = new Friendship(moises.getUserID(), davila.getUserID(), 23);
//        Friendship friendship5 = new Friendship(moises.getUserID(), ortiz.getUserID(), 24);
//        Friendship friendship6 = new Friendship(davila.getUserID(), ortiz.getUserID(), 34);        
//        
//        grafo.newEdge(friendship1);
//        grafo.newEdge(friendship2);
//        grafo.newEdge(friendship3);
//        grafo.newEdge(friendship4);
//        grafo.newEdge(friendship5);
//        grafo.newEdge(friendship6);
//        
//        FileManager fileManager = new FileManager();
//        
//        fileManager.writeDBtxt(grafo);
//        
//        
//        fileManager.fromJFCtoDB();
//        
//        grafo = fileManager.readDBtxt();
//        
//        System.out.println(grafo.toString());
//        
//        
//        fileManager.writeDBtxt(grafo);
//        
//        
//        Explorer explorer = new Explorer();
//        boolean [] discovered = new boolean[grafo.getNumNodes()];
//        int cant = explorer.DFS(grafo, grafo.getpFirst(), discovered);
//        System.out.println("La cantidad de islas es:"+ cant);
//
//=======
//        App app = new App();
//        app.start();
////
//        GraphM grafo = new GraphM();
//        User david = new User(1, "@dmdo");
//        User moises = new User(2, "@dmdo");
//        User davila = new User(3, "@dmdo");
//        User ortiz = new User(4, "@dmdooo");
//        
//        grafo.newNode(david);
//        grafo.newNode(moises);
//        grafo.newNode(davila);
//        grafo.newNode(ortiz);
//        
//        Friendship friendship1 = new Friendship(david.getUserID(), moises.getUserID(), 12);
//        Friendship friendship2 = new Friendship(david.getUserID(), davila.getUserID(), 13);
//        Friendship friendship3 = new Friendship(david.getUserID(), ortiz.getUserID(),14);
//        Friendship friendship4 = new Friendship(moises.getUserID(), davila.getUserID(), 23);
//        Friendship friendship5 = new Friendship(moises.getUserID(), ortiz.getUserID(), 24);
//        Friendship friendship6 = new Friendship(davila.getUserID(), ortiz.getUserID(), 34);        
//        
//        grafo.newEdge(friendship1);
//        grafo.newEdge(friendship2);
//        grafo.newEdge(friendship3);
//        grafo.newEdge(friendship4);
//        grafo.newEdge(friendship5);
//        grafo.newEdge(friendship6);
//        
//        FileManager fileManager = new FileManager();
//        
//        fileManager.writeDBtxt(grafo);
//        
//        
//        fileManager.fromJFCtoDB();
//        
//        grafo = fileManager.readDBtxt();
//        
//        System.out.println(grafo.toString());
//        
//        
//        fileManager.writeDBtxt(grafo);
//        

    }
    
}
