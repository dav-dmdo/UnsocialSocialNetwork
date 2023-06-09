/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileManagement;

import Grafo.GraphM;
import ImportantClasses.Friendship;
import ImportantClasses.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * This class is meant to handle .txt operations, from writing and reading to
 * copying data from JFileChooser
 *
 * @author david
 */
public class FileManager {

    private String path = "test\\db.txt";

    /**
     * Call graph's method ToString and write
     *
     * @param graph
     */
    public void writeDBtxt(GraphM graph) {

        String programData = graph.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.path))) {
            writer.write(programData);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public GraphM readDBtxt() { 
        
        GraphM graph = new GraphM();
        try {
            loadUsers(graph, this.path);
            loadFriendships(graph, this.path);
        } catch (Exception e) {
            System.out.println(e);
        }

        return graph;
    }

    public void fromJFCtoDB() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de texto", "txt"));

        int selected = fileChooser.showOpenDialog(null);

        if (selected == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            File dbFile = new File(this.path);

            try {
                BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(dbFile));
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                reader.close();
                writer.close();
                JOptionPane.showMessageDialog(null,"El archivo " + selectedFile.getName() + " fue copiado en " + dbFile.getName() + " con exito!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Error al copiar el archivo: " + e.getMessage());
            }

        }

    }

    public void loadUsers(GraphM graph, String path) {

        boolean flag = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("Usuarios")) {
                    flag = true;
                    line = reader.readLine();
                } else if (line.equals("Relaciones")) {
                    flag = false;
                }
                if (flag) {
                    if (line.contains(" ")) {
                        line = line.replace(" ", "");
                    }
                    String[] lineArray = line.split(",");
                    int id = Integer.parseInt(lineArray[0]);
                    String name = lineArray[1];
                    User user = new User(id, name);
                    graph.newNode(user);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer los usuarios del archivo: " + e.getMessage());
        }

    }

    public void loadFriendships(GraphM graph, String path) {

        boolean flag = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("Relaciones")) {
                    flag = true;
                    line = reader.readLine();
                } else if (line.equals("Usuarios")) {
                    flag = false;
                }
                if (flag) {
                    if (line.contains(" ")) {
                        line = line.replace(" ", "");
                    }
                    String[] lineArray = line.split(",");
                    int user1ID = Integer.parseInt(lineArray[0]);
                    int user2ID = Integer.parseInt(lineArray[1]);
                    int weight = Integer.parseInt(lineArray[2]);
                    Friendship friendship = new Friendship(user1ID, user2ID, weight);
                    graph.newEdge(friendship);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al leer las relaciones del archivo: " + e.getMessage());
        }

    }

}
