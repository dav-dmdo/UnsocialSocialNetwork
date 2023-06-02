/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import GUIs.MainGUI;
import Grafo.Graph;

/**
 *
 * @author david
 */
public class App {
    MainGUI mainGUI;
    Graph graph;
    
    public App(){
        this.mainGUI = null;
        this.graph = new Graph();
                
    }
    
    public void start(){
        this.mainGUI = new MainGUI();
    }
}
