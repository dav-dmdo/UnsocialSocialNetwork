/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import FileManagement.FileManager;
import GUIs.MainView;
import Grafo.Graph;

/**
 *
 * @author david
 */
public class App {
    MainView mainGUI;
    Graph graph;
    FileManager file = new FileManager();
    
    public App(){
        this.mainGUI = null;
        this.graph = new Graph();
                
    }
    
    public void start(){
        this.graph =file.readDBtxt();
        this.mainGUI = new MainView(graph);
        //System.out.println(graph.toString());
        this.mainGUI.show();
    }
}
