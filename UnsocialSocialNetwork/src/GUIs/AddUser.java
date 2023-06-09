/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import EDD.List;
import EDD.NodoEDD;
import Grafo.GraphM;
import ImportantClasses.Friendship;
import ImportantClasses.Helpers;
import ImportantClasses.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class AddUser extends javax.swing.JFrame {
    static GraphM graph;
    static int userID;
    static String userNickname;
    static List relations;
    static List yearsFriendship;
    static Friendship friends;

    /**
     * Creates new form AddUser
     */
    public AddUser(GraphM graph) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.graph = graph;
        showUsers.setText(graph.usersToString());
        

        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showUsers = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        userIDInput = new javax.swing.JTextField();
        checkID = new javax.swing.JButton();
        friendshipInput = new javax.swing.JTextField();
        addRelation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userNicknameInput1 = new javax.swing.JTextField();
        checkUser = new javax.swing.JButton();
        Finalize = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        inputRelationYear = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addYears = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ADD A FRIEND!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        showUsers.setEditable(false);
        showUsers.setBackground(java.awt.SystemColor.activeCaptionBorder);
        showUsers.setColumns(20);
        showUsers.setForeground(new java.awt.Color(0, 0, 0));
        showUsers.setRows(5);
        jScrollPane1.setViewportView(showUsers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 250));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("To add an user you need to fill the folllowing:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        userIDInput.setBackground(java.awt.SystemColor.activeCaptionBorder);
        userIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDInputActionPerformed(evt);
            }
        });
        jPanel1.add(userIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 150, -1));

        checkID.setBackground(new java.awt.Color(0, 0, 255));
        checkID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkID.setForeground(new java.awt.Color(255, 255, 255));
        checkID.setText("Check");
        checkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIDActionPerformed(evt);
            }
        });
        jPanel1.add(checkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 80, -1));

        friendshipInput.setBackground(java.awt.SystemColor.activeCaptionBorder);
        friendshipInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendshipInputActionPerformed(evt);
            }
        });
        jPanel1.add(friendshipInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 150, -1));

        addRelation.setBackground(new java.awt.Color(0, 0, 255));
        addRelation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addRelation.setForeground(new java.awt.Color(255, 255, 255));
        addRelation.setText("Add ");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });
        jPanel1.add(addRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Create user!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Please enter your user ID (in numbers)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("NOTE: You need to type the user's ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("ID whom you want to relate to.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, 20));

        exit.setBackground(new java.awt.Color(0, 0, 204));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/200x200.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Please enter your username putting \"@\" before the user");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 330, -1));

        userNicknameInput1.setBackground(java.awt.SystemColor.activeCaptionBorder);
        userNicknameInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNicknameInput1ActionPerformed(evt);
            }
        });
        jPanel1.add(userNicknameInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, -1));

        checkUser.setBackground(new java.awt.Color(0, 0, 255));
        checkUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkUser.setForeground(new java.awt.Color(255, 255, 255));
        checkUser.setText("Check");
        checkUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUserActionPerformed(evt);
            }
        });
        jPanel1.add(checkUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 80, -1));

        Finalize.setBackground(new java.awt.Color(0, 0, 255));
        Finalize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Finalize.setForeground(new java.awt.Color(255, 255, 255));
        Finalize.setText("FINALIZE PROCCESS!");
        Finalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizeActionPerformed(evt);
            }
        });
        jPanel1.add(Finalize, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("by commas in the same order as users created.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 380, -1));

        inputRelationYear.setBackground(java.awt.SystemColor.activeCaptionBorder);
        inputRelationYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRelationYearActionPerformed(evt);
            }
        });
        jPanel1.add(inputRelationYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Without creating the user, the relationships wont show");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 340, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Please enter their friendship years separating them");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 380, -1));

        addYears.setBackground(new java.awt.Color(0, 0, 255));
        addYears.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addYears.setForeground(new java.awt.Color(255, 255, 255));
        addYears.setText("Add ");
        addYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYearsActionPerformed(evt);
            }
        });
        jPanel1.add(addYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Please enter one or more relations separating them by \",\"");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 340, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 770, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDInputActionPerformed

    private void checkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIDActionPerformed
        try{
        int number = Helpers.valorNumero(userIDInput.getText());
            if (number!=-1) { 
          number = Helpers.validID(graph, number); //Checks if the number is not on the existents users
        //CHECK IF IT EXISTS
            if (number !=-1) {
                  JOptionPane.showMessageDialog(this, "This is an available ID!");
            userID=number; 
                
   
        
        }else{
            JOptionPane.showMessageDialog(this, "Not an available ID");
            userIDInput.setText("");
            }
            
            }}catch(Exception e) {
        JOptionPane.showMessageDialog(this, "This is not a valid ID" + e);
        userIDInput.setText("");}
       
    }//GEN-LAST:event_checkIDActionPerformed

    private void friendshipInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendshipInputActionPerformed
   
    }//GEN-LAST:event_friendshipInputActionPerformed

    private void userNicknameInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNicknameInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNicknameInput1ActionPerformed

    private void checkUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUserActionPerformed

       String username = Helpers.nickname(userNicknameInput1.getText());
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "This is not a valid username");
            userNicknameInput1.setText("");
           
        }
        else if (username.equalsIgnoreCase("no")) {
            userNicknameInput1.setText("");
            
        }else{
            username=Helpers.validNickname(graph, username);
            if (username!=null) {
                userNickname = username;
                JOptionPane.showMessageDialog(this, "This nickname is available!");
                
            }else{
            JOptionPane.showMessageDialog(this, "This is not an available username.");}
        }
        
    }//GEN-LAST:event_checkUserActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void FinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizeActionPerformed
        try {
            User user =new User(userID, userNickname);
            graph.newNode(user);
           // showUsers.setText(userNickname +", "+userID+"\nRelations\n" + relations.showList());
            showUsers.setText(graph.usersToString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error " + e);
        }
    }//GEN-LAST:event_FinalizeActionPerformed

    private void addRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationActionPerformed
         
        
        
        try{
             
                String text= friendshipInput.getText();
                String[] numbers =text.split(",");
                List list= new List();
                boolean possible=true;
                while(possible == true){
                for (int i = 0; i < numbers.length; i++) {
                    int number = Integer.parseInt(numbers[i]);
                    number =Helpers.validID2(graph, number);
                    if (number != -1) {
                        list.addFirst(Integer.parseInt(numbers[i]));
                        
                        
                    }else{
                     JOptionPane.showMessageDialog(this, "This is not an existing ID");
                     possible = false;
                    break;}}break;
                
                }if (possible==true) {
                    JOptionPane.showMessageDialog(this, "All the relations are valid! User relations succesfully added");
                relations = list;
            }
        
        
        //CHECK IF IT EXISTS
            
        
        }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR!" +e);
        friendshipInput.setText("");}
       
                                           

    }//GEN-LAST:event_addRelationActionPerformed

    private void inputRelationYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRelationYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRelationYearActionPerformed

    private void addYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYearsActionPerformed
       
        
        
        try{
                String text= inputRelationYear.getText();
                String[] numbers =text.split(",");
                List list= new List();
                boolean possible=true;
                while(possible == true){
                for (int i = 0; i < numbers.length; i++) {
                    int number = Integer.parseInt(numbers[i]);
                    number =Helpers.validID(graph, number);
                    if (number != -1) {
                        list.addFirst(Integer.parseInt(numbers[i]));
                        
                        
                    }else{
                     JOptionPane.showMessageDialog(this, "This is not an existing ID");
                     possible = false;
                    break;}}break;
                
                }if (possible==true) {
                    if (relations.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please enter the users you want to be friends with first.");
                
            }else{
                        if (relations.getSize()==list.getSize()) {
                            yearsFriendship = list;
                            NodoEDD aux = yearsFriendship.getPfirst();
                            NodoEDD aux2 = relations.getPfirst();
                            for (int i = 0; i < yearsFriendship.getSize(); i++) {
                           Friendship relation = new Friendship(userID,aux2.getData(),aux.getData());
                           
                           graph.newEdge(relation);
                                aux = aux.getpNext();
                                aux2= aux2.getpNext();
                                
                            }
                            JOptionPane.showMessageDialog(this, "Added succesfully!");
                            
                            
                            
                        }else{
                        JOptionPane.showMessageDialog(this, "You are missing a parameter.");}
                    }
                    
            }
        
        
            
        
        }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR!" +e);
        friendshipInput.setText("");}
       
                                           

                             
    }//GEN-LAST:event_addYearsActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser(graph).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finalize;
    private javax.swing.JButton addRelation;
    private javax.swing.JButton addYears;
    private javax.swing.JButton checkID;
    private javax.swing.JButton checkUser;
    private javax.swing.JButton exit;
    private javax.swing.JTextField friendshipInput;
    private javax.swing.JTextField inputRelationYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea showUsers;
    private javax.swing.JTextField userIDInput;
    private javax.swing.JTextField userNicknameInput1;
    // End of variables declaration//GEN-END:variables
}
