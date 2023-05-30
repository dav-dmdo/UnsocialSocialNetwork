/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_management;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import File_management.DataM;

/**
 *
 * @author Posilandia
 */
public class File_m {

    /*
                LEER ARCHIVO DESDE LA VENTANA
     */
    public static void load_file() {
        DataM datos = new DataM();
        Scanner entrada = null;
        String linea = "";
        int flagUser = 0;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                //System.out.println(entrada.nextLine());
                linea = entrada.nextLine();
                if (linea.equals("Usuarios")) {
                    flagUser = 1;
                }
                if (linea.equals("Relaciones")) {
                    flagUser = 2;
                }

                if (flagUser == 1) {
                    datos.FillNode(linea);
                }
                if (flagUser == 2) {
                    datos.LoadRelation(linea);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }

    /*
                LEER ARCHIVO AL ABRIR EL PROGRAMA
     */
    public static void init_file() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:/Users/Posilandia/Desktop/data.txt");            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            
            
            
            FileInputStream fis = null;
            fis = new FileInputStream("C:/Users/Posilandia/Desktop/data.txt");
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

// FIN CLASE    
}
