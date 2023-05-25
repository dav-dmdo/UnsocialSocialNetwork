/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import GUIs.MainGUI;

/**
 *
 * @author david
 */
public class App {
    MainGUI mainGUI;
    
    public App(){
        this.mainGUI = null;
    }
    
    public void start(){
        this.mainGUI = new MainGUI();
    }
}
