/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import FileManagement.FileManager;
import GUIs.MainGUI;
import Grafo.Graph;
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
        
        
//        App app = new App();
//        app.start();

        Graph grafo = new Graph();
        User david = new User(123, "@dmdo");
        User moises = new User(123, "@dmdo");
        User davila = new User(123, "@dmdo");
        User ortiz = new User(12, "@dmdooo");
        
        grafo.newNode(david);
        grafo.newNode(moises);
        grafo.newNode(davila);
        grafo.newNode(ortiz);
        
        FileManager fileManager = new FileManager();
        
        fileManager.writeDBtxt(grafo);
        
        
        fileManager.fromJFCtoDB();
        
        grafo = fileManager.readDBtxt();
        System.out.println(grafo.usersToString());
        
    }
    
}
