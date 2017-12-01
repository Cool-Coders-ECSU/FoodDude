 
package food_dude;

import java.awt.*;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.text.NumberFormatter;


/**
 *
 * @author drcouncil
 */
public class DinnerOrder extends javax.swing.JFrame {

    protected double entreePrice;
protected double drinkPrice;
protected double tax = 0.07;
protected double total;
protected double discount;


Connection connect = null;
PreparedStatement pst = null;
ResultSet rs = null;

   

    public DinnerOrder() {
        initComponents();
         jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        
        
        picDescription.setBorder(null);
        
         jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        
        
        drinkDescription.setBorder(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WaitressButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        EntreeTitle = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        DrinkTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drinkDescription = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        picDescription = new javax.swing.JTextArea();
        Entree = new javax.swing.JComboBox();
        DrinkCombo = new javax.swing.JComboBox();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 380));
        getContentPane().setLayout(null);

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
        WaitressButton.setBounds(630, 90, 140, 37);

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setText("Back");
        exitButton.setPreferredSize(new java.awt.Dimension(153, 37));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(10, 20, 100, 30);

        Title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Dinner Menu:");
        getContentPane().add(Title);
        Title.setBounds(200, 20, 390, 60);

        EntreeTitle.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        EntreeTitle.setForeground(new java.awt.Color(255, 255, 0));
        EntreeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntreeTitle.setText("COMBO");
        getContentPane().add(EntreeTitle);
        EntreeTitle.setBounds(60, 150, 180, 40);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Done");
        addButton.setPreferredSize(new java.awt.Dimension(153, 37));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(660, 20, 100, 30);

        DrinkTitle.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        DrinkTitle.setForeground(new java.awt.Color(255, 255, 0));
        DrinkTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DrinkTitle.setText("DRINKS");
        getContentPane().add(DrinkTitle);
        DrinkTitle.setBounds(400, 150, 220, 30);

        drinkDescription.setBackground(new Color(0,0,0,64));
        drinkDescription.setColumns(20);
        drinkDescription.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        drinkDescription.setForeground(new java.awt.Color(255, 255, 51));
        drinkDescription.setLineWrap(true);
        drinkDescription.setRows(5);
        drinkDescription.setOpaque(false);
        jScrollPane2.setViewportView(drinkDescription);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(430, 430, 240, 80);

        jScrollPane1.setOpaque(false);

        picDescription.setEditable(false);
        picDescription.setBackground(new Color(0,0,0,64));
        picDescription.setColumns(20);
        picDescription.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        picDescription.setForeground(new java.awt.Color(255, 255, 1));
        picDescription.setLineWrap(true);
        picDescription.setRows(5);
        picDescription.setWrapStyleWord(true);
        picDescription.setOpaque(false);
        jScrollPane1.setViewportView(picDescription);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 430, 260, 80);

        Entree.setMaximumRowCount(14);
        Entree.setModel(practice());
        Entree.setAutoscrolls(true);
        Entree.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true), null));
        Entree.setMinimumSize(new java.awt.Dimension(89, 42));
        Entree.setPreferredSize(new java.awt.Dimension(200, 28));
        Entree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntreeActionPerformed(evt);
            }
        });
        getContentPane().add(Entree);
        Entree.setBounds(60, 190, 250, 210);

        DrinkCombo.setModel(practice2());
        DrinkCombo.setBorder(null);
        DrinkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkComboActionPerformed(evt);
            }
        });
        getContentPane().add(DrinkCombo);
        DrinkCombo.setBounds(430, 190, 240, 210);

        Background.setBackground(new java.awt.Color(0, 0, 255));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_green-HD[1].jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(960, 960));
        Background.setMinimumSize(new java.awt.Dimension(480, 480));
        Background.setName(""); // NOI18N
        Background.setOpaque(true);
        Background.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(Background);
        Background.setBounds(0, 10, 790, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WaitressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaitressButtonActionPerformed
        JOptionPane.showMessageDialog(null," A waitress is on the way!");        // TODO add your handling code here:
    }//GEN-LAST:event_WaitressButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        dispose();
        new MenuPrompt().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    
    
    protected DefaultComboBoxModel<Icon> practice()      
{
    
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    
    ImageIcon b0 = new ImageIcon("NONE");
    d.addElement(b0);
    ImageIcon b1 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\dinner1.png");
    d.addElement(b1);
    ImageIcon b2 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\dinner2.jpg");
   d.addElement(b2);
   ImageIcon b3 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\dinner3.jpg");
    d.addElement(b3);
    return d;
}

    
                                        
protected DefaultComboBoxModel<Icon> practice2()      
{
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    
    ImageIcon drink = new ImageIcon("NONE");
    d.addElement(drink);
    ImageIcon drink1 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\drpepper.png");
    d.addElement(drink1);
    ImageIcon drink2 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\drpepper.png");
   d.addElement(drink2);
   ImageIcon drink3 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\drpepper.png");
    d.addElement(drink3);
    return d;
}


    
    
    
    
    
    
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
double sum;
        sum = (entreePrice + drinkPrice) * tax;
        total = sum + entreePrice + drinkPrice;
        double t1 = total;

        int YesOrNo = JOptionPane.showConfirmDialog(null, "Are you done with your order? Your price is $" + String.format("%.2f",total) + ".","Yes", JOptionPane.YES_NO_OPTION);

        if(YesOrNo == 0)
        {
            if(total<=0)
            {JOptionPane.showMessageDialog(null,"Sorry, your order was NOT processed nothing was bought!"); }
            else
            {
                try{
                    String val1 = picDescription.getText();
                    String val2 = drinkDescription.getText();
                    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                    Class.forName("org.sqlite.JDBC");
                    
                     
                    connect = DriverManager.getConnection("jdbc:sqlite:C:/Users/drcouncil/Desktop/FoodDude.db");
                    String sql = "insert into foodude(combo, drink, Time)values(?,?,?)";
                    pst = connect.prepareStatement(sql);
                    
                  pst.setString(1, val1);
                pst.setString(2, val2);
                pst.setString(3, timeStamp);
                pst.executeUpdate();
                
                
                   
                    
                
                    JOptionPane.showMessageDialog(null,"Thanks, Your order will be out shortly!");
                }

                catch (Exception e)
                { JOptionPane.showMessageDialog(null, "ERROR,PLEASE ALERT WAITRESS");}

            }

        }

        else
        {}
    }//GEN-LAST:event_addButtonActionPerformed

    private void EntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntreeActionPerformed
        if(Entree.getSelectedIndex()==0)
        { picDescription.setText("");
            entreePrice = 0.00;
        } else if(Entree.getSelectedIndex()==1)
        { picDescription.setText("Fried Chicken,Mac&Cheese, & Collard Greens - $6.67");
            entreePrice = 6.67;
        } else if(Entree.getSelectedIndex()==2)
        { picDescription.setText("BBQ Ribs, Fries, & Rice - $7.99");
            entreePrice = 7.99;
        } else if(Entree.getSelectedIndex()==3)
        { picDescription.setText("Mac&Cheese,Collard Greens, Beans, Slice Sweet Potato, Corn Bread - $5.99");
            entreePrice = 5.99;
        }

        //EntreeTxtDescription.setText(Entree.getSelectedItem().toString());
        //jTextArea1.setText(Entree.getSelectedItem().toString());
    }//GEN-LAST:event_EntreeActionPerformed

    private void DrinkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkComboActionPerformed
        if(DrinkCombo.getSelectedIndex()==0)
        { drinkDescription.setText("");
            drinkPrice = 0.00;}
        else if(DrinkCombo.getSelectedIndex()==1)
        { drinkDescription.setText("Dr Pepper - $1.07");
            drinkPrice = 1.07;
        } else if(DrinkCombo.getSelectedIndex()==2)
        { drinkDescription.setText("Pepsi - $1.07");
            drinkPrice = 1.07;
        } else if(DrinkCombo.getSelectedIndex()==3)
        { drinkDescription.setText("Coca Cola - $1.07");
            drinkPrice = 1.07;
        }
    }//GEN-LAST:event_DrinkComboActionPerformed

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
            java.util.logging.Logger.getLogger(DinnerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DinnerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DinnerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DinnerOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DinnerOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox DrinkCombo;
    private javax.swing.JLabel DrinkTitle;
    private javax.swing.JComboBox Entree;
    private javax.swing.JLabel EntreeTitle;
    private javax.swing.JLabel Title;
    private javax.swing.JButton WaitressButton;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea drinkDescription;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea picDescription;
    // End of variables declaration//GEN-END:variables
}
