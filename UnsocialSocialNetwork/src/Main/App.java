/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import File_management.File_m;
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
        File_m archivo = new File_m();
        archivo.init_file();
        this.mainGUI = new MainGUI();
    }
}
