/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_management;
import EDD.Node;

/**
 *
 * @author Posilandia
 */
public class DataM {
    Node nodoNuevo = new Node();
    
    
    public String[] CutLines(String linea) {
        return linea.split("\\.");
    }
    
    
    
    public void FillNode(String linea){
        String userName = "";
        int userId = 0;
        String [] UserArray = CutLines(linea);
        userName = UserArray[1];
        userId = Integer.parseInt(UserArray[0]);
        nodoNuevo.setUserId(userId);
        nodoNuevo.setUserName(userName);
        
    }
    

    
    public void LoadRelation(String linea){
        
        
    }
}
