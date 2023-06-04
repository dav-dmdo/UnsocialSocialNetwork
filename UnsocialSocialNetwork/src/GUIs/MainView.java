/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import FileManagement.FileManager;
import Grafo.GraphM;
import Grafo.GraphNode;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;

import org.graphstream.graph.implementations.MultiGraph;

import org.graphstream.ui.view.Viewer;

import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.swing_viewer.ViewPanel;



/**
 *
 * @author Andrea
 */
public class MainView extends javax.swing.JFrame {
    static GraphM graph;
    static FileManager file;
    

    /**author:Andrea
     * Creates new form NewJFrame
     * @param graph
     */
    public MainView(GraphM graph) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.graph= graph;
        this.file= new FileManager();
        
    }
    /**
     * This method displays the graph.
     * @param graph2 
     */
     private void displayGraph(Graph graph2) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      JPanel panel = new JPanel(new GridLayout()){
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 480);
            }
        };
        frame.setSize(panel.getWidth(), panel.getHeight());
     
        Viewer viewer = new SwingViewer(graph2, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        viewer.enableAutoLayout();
        ViewPanel viewPanel = (ViewPanel) viewer.addDefaultView(false);
        panel.add(viewPanel);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddUSer = new javax.swing.JButton();
        RemoveNode = new javax.swing.JButton();
        loadFile = new javax.swing.JButton();
        showGraph = new javax.swing.JButton();
        seeIsles = new javax.swing.JToggleButton();
        bridgeCheck = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddUSer.setBackground(new java.awt.Color(0, 0, 255));
        AddUSer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddUSer.setForeground(new java.awt.Color(255, 255, 255));
        AddUSer.setText("Add friend");
        AddUSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUSerActionPerformed(evt);
            }
        });
        jPanel1.add(AddUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        RemoveNode.setBackground(new java.awt.Color(0, 0, 255));
        RemoveNode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RemoveNode.setForeground(new java.awt.Color(255, 255, 255));
        RemoveNode.setText("Remove user");
        RemoveNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveNodeActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        loadFile.setBackground(new java.awt.Color(0, 0, 255));
        loadFile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loadFile.setForeground(new java.awt.Color(255, 255, 255));
        loadFile.setText("Load Files");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });
        jPanel1.add(loadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        showGraph.setBackground(new java.awt.Color(0, 0, 255));
        showGraph.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showGraph.setForeground(new java.awt.Color(255, 255, 255));
        showGraph.setText("Show Graph");
        showGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGraphActionPerformed(evt);
            }
        });
        jPanel1.add(showGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        seeIsles.setBackground(new java.awt.Color(0, 0, 255));
        seeIsles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seeIsles.setForeground(new java.awt.Color(255, 255, 255));
        seeIsles.setText("See isles");
        seeIsles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeIslesActionPerformed(evt);
            }
        });
        jPanel1.add(seeIsles, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        bridgeCheck.setBackground(new java.awt.Color(0, 0, 255));
        bridgeCheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bridgeCheck.setForeground(new java.awt.Color(255, 255, 255));
        bridgeCheck.setText("See Bridges");
        bridgeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bridgeCheckActionPerformed(evt);
            }
        });
        jPanel1.add(bridgeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("UNSOCIAL SOCIAL NETWORK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        Exit.setBackground(new java.awt.Color(0, 0, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jScrollPane1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jScrollPane1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the Unsocial Social Network! \nHere you will see multiple relations, what do\nyou want to do?\n\n1) Add a friend: Adds a friend with relations.\n2) Remove a friend: removes user and its\n relations.\n 3) Load files: Adds a new file.\n4) Show graph: shows all connections.\n5) See isles: shows the total amount of groups\n users have.\n6) See bridges: allows the user to identify what\n users are bridges to isles.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 270, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/WORLD.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 560, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This shows Isles Interface
 * @param evt 
 */
    private void seeIslesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeIslesActionPerformed
        Isles isles = new Isles(graph);
        isles.show();
    }//GEN-LAST:event_seeIslesActionPerformed
/**
 * This shows add user interface.
 * @param evt 
 */
    private void AddUSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUSerActionPerformed
       AddUser v2= new AddUser(graph);
       v2.show();
       
    }//GEN-LAST:event_AddUSerActionPerformed
/**
 * This shows bridge interface
 * @param evt 
 */
    private void bridgeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bridgeCheckActionPerformed
        Bridges v7 = new Bridges(graph);
        v7.show();
    }//GEN-LAST:event_bridgeCheckActionPerformed
/**
 * This exits interface saving the latest changes.
 * @param evt 
 */
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        file.writeDBtxt(graph);
        JOptionPane.showMessageDialog(this, "NOTICE! All your last changes have been saved.");
        
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed
/**
 * This shows eliminate friend interface
 * @param evt 
 */
    private void RemoveNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveNodeActionPerformed
       DeleteFriend v3= new DeleteFriend(graph, this);
       v3.show();
    }//GEN-LAST:event_RemoveNodeActionPerformed
/**
 * This shows load file interface
 * @param evt 
 */
    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        LoadFile v6 = new LoadFile(graph);
        v6.show();
    }//GEN-LAST:event_loadFileActionPerformed
/**
 * This shows graphic graph
 * @param evt 
 */
    private void showGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGraphActionPerformed
          Graph graphLibrary = new MultiGraph("Unsocial Social Network");
          System.setProperty("org.graphstream.ui", "swing");
          GraphNode auxNodo = graph.getpFirst();
          String users = graph.usersToString();
          String friendships = graph.friendshipsToString();
          String[] user = users.split("\n");
          
          //Recorre los vertices y los agrega al grafo
          for (int i = 1; i < user.length; i++) {

              String[] array= user[i].split(",");
              graphLibrary.addNode(array[0]).setAttribute("ui.label", array[0]);
              
              
        }
          //Recorre los puentes y los agrega al grafo
          String[] friends= friendships.split("\n");
          for (int i = 1; i < friends.length; i++) {
              String[] arrays = friends[i].split(",");
              
              graphLibrary.addEdge(arrays[0]+","+arrays[1],arrays[0],arrays[1]).setAttribute("ui.label", arrays[2]);
            
        }
         
            
          this.displayGraph(graphLibrary);
          
    }//GEN-LAST:event_showGraphActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView(graph).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUSer;
    private javax.swing.JButton Exit;
    private javax.swing.JButton RemoveNode;
    private javax.swing.JToggleButton bridgeCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loadFile;
    private javax.swing.JToggleButton seeIsles;
    private javax.swing.JButton showGraph;
    // End of variables declaration//GEN-END:variables
}
