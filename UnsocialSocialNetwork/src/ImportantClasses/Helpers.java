/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImportantClasses;

import Grafo.Graph;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Helpers {

    /**
     * This method checks if the parameter sent is a int.
     *
     * @param numString
     * @return
     */
    public static int valorNumero(String numString) {
        int num;
        try {
            num = Integer.parseInt(numString);
            if (num > 0) {
                return num;

            } else {
                JOptionPane.showMessageDialog(null, "This isnt a valid number. ");
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This isnt a valid number. ");
        }

        return -1;
    }

    /**
     * This method checks if the first character of the string sent is a @.
     *
     * @param nickname
     * @return
     */
    public static String nickname(String nickname) {

        String b = "@";

        char firstLetter = nickname.charAt(0);
        String chart = Character.toString(firstLetter);

        if (chart.equalsIgnoreCase(b)) {
            if (nickname.length() == 1) {
                JOptionPane.showMessageDialog(null, "This is not a valid username");
                return "no";

            } else {
                return nickname;
            }
        } else {
            JOptionPane.showMessageDialog(null, "This is not a valid username");
            return "no";
        }
    }

    public static int validID(Graph g, int number) {
        boolean answer;
        try {
            answer = g.existsNodeID(number);
            if (answer == false) {
                return number;

            } else if(answer == true){
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is not an available ID.");
           
        }
    return -1;}
        
    public static int validID2(Graph g, int number) {
        boolean answer;
        try {
            answer = g.existsNodeID(number);
            if (answer == true) {
                return number;

            } else if(answer == false){
                return -1;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is not an available ID.");
           
        }
    return -1;}
        
    
    
    public static String validNickname(Graph graph, String nickname) {
        boolean answer;
        try {
            answer = graph.existsNodeID(nickname);
            if (answer ==false) {
                return nickname;

            }else if(answer == true){
            return "0";}
            }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is not a valid nickname because " + e);
        }
        return null;
    }
}
