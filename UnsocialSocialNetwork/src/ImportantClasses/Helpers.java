/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImportantClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Helpers {
      /**
     * This method checks if the parameter sent is a int.
     * @param numString
     * @return 
     */
    public static int valorNumero(String numString){
    int num;
    try{
        num = Integer.parseInt(numString);
        if (num>0) {
            return num;
            
        }else{
            JOptionPane.showMessageDialog(null, "This isnt a valid number. ");
        return -1;
        }
        
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "This isnt a valid number. ");
    }

    return -1;
    }
    
     /**
     * This method checks if the first character of the string sent is a @.
     * @param nickname
     * @return 
     */
    public static String nickname(String nickname){
    
    String b= "@";
    
        char firstLetter = nickname.charAt(0);
        String chart= Character.toString(firstLetter);
       
         if (chart.equalsIgnoreCase(b)) {
             if (nickname.length()==1) {
                 JOptionPane.showMessageDialog(null, "This is not a valid username");
         return "no";
                 
                 
             }else{
             return nickname;}
}else{
         JOptionPane.showMessageDialog(null, "This is not a valid username");
         return "no";}
         
    }
}
