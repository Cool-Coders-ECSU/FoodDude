/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food_dude;

/**
 *
 * @author ikjames647
 */


import java.awt.*;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;

/**
 *
 * @author drcouncil
 */
public class DinnerMenuPrompt extends javax.swing.JFrame {

Connection myrun = null;
Statement mystate = null;
ResultSet myupdate = null;


    public DinnerMenu() {
        initComponents();
    
    }
  
    
    
   
public void selectionall()
{
    try{
myrun=DriverManager.getConnection("jdbc:derby://localhost:1527/FoodDude_DB","Davion","drcouncil");
mystate =myrun.createStatement();
        myupdate= mystate.executeQuery("Select * from Davion.Ticket");
        
        
    }
    
    catch(SQLException e)
    { e.printStackTrace(); }


}
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entree = new javax.swing.JComboBox();
        addButton = new javax.swing.JButton();
        WaitressButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        exitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 340, 340));
        setUndecorated(true);
        getContentPane().setLayout(null);

        Entree.setMaximumRowCount(14);
        Entree.setModel(loadImages());
        Entree.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true), null));
        Entree.setMinimumSize(new java.awt.Dimension(89, 42));
        Entree.setPreferredSize(new java.awt.Dimension(200, 28));
        Entree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntreeActionPerformed(evt);
            }
        });
        getContentPane().add(Entree);
        Entree.setBounds(20, 270, 250, 210);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Done");
        addButton.setPreferredSize(new java.awt.Dimension(153, 37));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(530, 20, 140, 37);

        WaitressButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        WaitressButton.setForeground(new java.awt.Color(204, 0, 51));
        WaitressButton.setText("Need Waitress?");
        WaitressButton.setAutoscrolls(true);
        WaitressButton.setPreferredSize(new java.awt.Dimension(153, 37));
        WaitressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaitressButtonActionPerformed(evt);
            }
        });
        getContentPane().add(WaitressButton);
        WaitressButton.setBounds(530, 120, 140, 37);

        jComboBox1.setModel(loadImages2());
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D R I N K S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(400, 270, 270, 210);

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setText("Back");
        exitButton.setPreferredSize(new java.awt.Dimension(153, 37));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(10, 20, 100, 37);

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/T6yypye[1].jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WaitressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaitressButtonActionPerformed
        JOptionPane.showMessageDialog(null," A waitress is on the way!");        // TODO add your handling code here:
    }//GEN-LAST:event_WaitressButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"Thanks, Your order will be out shortly!");

       
    }//GEN-LAST:event_addButtonActionPerformed

    private void EntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntreeActionPerformed

    }//GEN-LAST:event_EntreeActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        dispose();
        new MenuPrompt().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    
    private DefaultComboBoxModel<Icon> loadImages()
    {
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    //Entree1
//d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree1.jpg"));    
//Entree2
    d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\entree1.jpg"));
    //Entree3
      d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\entree2.jpg"));
    d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\entree3.jpg"));
     d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\entree4.jpg"));
     
    
      return d;
    }
     private DefaultComboBoxModel<Icon> loadImages2()
    {
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
     d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\drink1.jpg")); 
     d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\Drink2.jpg"));
     d.addElement(new ImageIcon("C:\\Users\\ikjames647\\Documents\\NetBeansProjects\\food_dude\\src\\food_dude\\drink3.jpg")); 
     return d;
    }
    protected static ImageIcon createImageIcon(String path)
    {
    java.net.URL imgURL = DinnerMenu.class.getResource(path);
    if(imgURL != null)
    {return new ImageIcon(imgURL);}
    else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DinnerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DinnerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DinnerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DinnerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DinnerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Entree;
    private javax.swing.JButton WaitressButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void add(String[] entree, String PAGE_START) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
