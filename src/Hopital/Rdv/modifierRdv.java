/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hopital.Rdv;

import Hopital.myConnection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Badr
 */
public class modifierRdv extends javax.swing.JFrame {

    /**
     * Creates new form modifierRdv
     */
    public modifierRdv() {
        
        initComponents();
         jId.setVisible(false);
         jCin.setEditable(false);
        jNom.setEditable(false);
       jPrenom.setEditable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateRet = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        Jrech = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jDateR = new com.toedter.calendar.JDateChooser();
        jNom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCin = new javax.swing.JTextField();
        jPrenom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPrixVis = new javax.swing.JTextField();
        jHR = new javax.swing.JTextField();
        jId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date Rendez-Vous");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Heure Rendez-Vous");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date Retour");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Prix Visite");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hopital/images/save-icon--1.png"))); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hopital/images/Close.png"))); // NOI18N
        jButton2.setText("Fermer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hopital/images/follow(1).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, 70));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setText("??diter Rendez-vous");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 370, 70));

        jDateRet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jDateRet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 205, 28));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Rechercher par nom ou cin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 23));

        Jrech.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrechActionPerformed(evt);
            }
        });
        Jrech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JrechKeyPressed(evt);
            }
        });
        getContentPane().add(Jrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 205, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hopital/images/deleteAN.png"))); // NOI18N
        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 150, 40));

        jDateR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jDateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 205, 30));

        jNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomActionPerformed(evt);
            }
        });
        getContentPane().add(jNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 205, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nom");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cin");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jCin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCinActionPerformed(evt);
            }
        });
        getContentPane().add(jCin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 205, -1));

        jPrenom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 205, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Pr??nom");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jPrixVis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPrixVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrixVisActionPerformed(evt);
            }
        });
        getContentPane().add(jPrixVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 205, -1));

        jHR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 205, 30));
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 60, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hopital/images/waves.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
           if ( jCin.getText().equals("") || jNom.getText().equals("")|| jPrenom.getText().equals("")||jDateR.getDate()==null|| jDateRet.getDate()==null||jPrixVis.getText().equals("")||jHR.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir les champs");
            }
            else{
                  int id =Integer.parseInt(jId.getText());  
                  String cin=jCin.getText();
                String nom=jNom.getText();
                String prenom=jPrenom.getText();

                 SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
       String dateR = dateFormat1.format(jDateR.getDate());
        String heureR=jHR.getText();
       SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
       String dateRetour = dateFormat2.format(jDateRet.getDate());
        double prixVisite=Double.parseDouble(jPrixVis.getText());
              

                Connection con=myConnection.getCon();
                Statement stm=con.createStatement();
                stm.executeUpdate("update rdv set cin='"+cin+"',nom='"+nom+"',prenom='"+prenom+"',dateRdv='"+dateR+"',heureRdv='"+heureR+"',dateRetour='"+dateRetour+"',prixVisite='"+prixVisite+"' where id='"+id+"'");
                JOptionPane.showMessageDialog(null, "La modification est bien ");
                setVisible(false);
                new modifierRdv().setVisible(true);
            }  } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Essayez autre fois");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrechActionPerformed

    private void JrechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JrechKeyPressed
        // TODO add your handling code here:
        String rech=Jrech.getText();
        try {
            Connection con=myConnection.getCon();
            Statement stm=con.createStatement();
            ResultSet rs= stm.executeQuery("select * from rdv where cin LIKE '%" + rech + "%' OR nom LIKE '%" + rech + "%'");

            if (rs.next()) {
                jId.setText(rs.getString("ID"));
                jCin.setText(rs.getString("cin"));
                jNom.setText(rs.getString("nom"));
                jPrenom.setText(rs.getString("prenom"));
                jDateR.setDate(rs.getDate("dateRdv"));
                jHR.setText(rs.getString("HeureRdv"));
                jDateRet.setDate(rs.getDate("dateRetour"));
                jPrixVis.setText(String.valueOf(rs.getDouble("prixVisite")));
          
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Essayez autre fois");
        }
    }//GEN-LAST:event_JrechKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if ( jCin.getText().equals("") || jNom.getText().equals("")|| jPrenom.getText().equals("")||jDateR.getDate()==null|| jDateRet.getDate()==null||jPrixVis.getText().equals("")||jHR.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir les champs");
            }
        else{
            int a=JOptionPane.showConfirmDialog(null,"Voulez-vous vraiment annuler ce rendez-vous ?","delete",JOptionPane.YES_OPTION);
            if (a==0) {
                try{

                    Connection con=myConnection.getCon();
                    Statement stm=con.createStatement();
                    stm.executeUpdate("delete from rdv where cin='"+jCin.getText()+"'");
                    JOptionPane.showMessageDialog(null, "Le rendez-vous est bien annul??");
                    setVisible(false);
                    new modifierRdv().setVisible(true);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Essayez autre fois");
                }
            }}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomActionPerformed

    private void jCinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCinActionPerformed
        // TODO add your handling code here:
    

    }//GEN-LAST:event_jCinActionPerformed

    private void jPrixVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrixVisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrixVisActionPerformed

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
            java.util.logging.Logger.getLogger(modifierRdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifierRdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifierRdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifierRdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifierRdv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jCin;
    private com.toedter.calendar.JDateChooser jDateR;
    private com.toedter.calendar.JDateChooser jDateRet;
    private javax.swing.JTextField jHR;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNom;
    private javax.swing.JTextField jPrenom;
    private javax.swing.JTextField jPrixVis;
    // End of variables declaration//GEN-END:variables
}
