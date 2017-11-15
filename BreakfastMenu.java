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

import javax.swing.*;
import static javax.swing.Action.MNEMONIC_KEY;
import static javax.swing.Action.SHORT_DESCRIPTION;

/**
 *
 * @author drcouncil
 */
public class BreakfastMenu extends javax.swing.JFrame {

Connection myrun = null;
Statement mystate = null;
ResultSet myupdate = null;


    public BreakfastMenu() {
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
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        WaitressButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Breakfast Menu:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Done");
        addButton.setPreferredSize(new java.awt.Dimension(153, 37));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setText("Back");
        exitButton.setPreferredSize(new java.awt.Dimension(153, 37));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        WaitressButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        WaitressButton.setForeground(new java.awt.Color(204, 0, 51));
        WaitressButton.setText("Need Waitress?");
        WaitressButton.setAutoscrolls(true);
        WaitressButton.setPreferredSize(new java.awt.Dimension(153, 37));
        WaitressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaitressButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D R I N K S", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Entree, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WaitressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Entree, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WaitressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private DefaultComboBoxModel<Icon> loadImages()
    {
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    //Entree1
//d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree1.jpg"));    
//Entree2
    d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
    //Entree3
      d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\images7N125SHX.jpg"));
    d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
     d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
      d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
       d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
        d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
         d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree2.jpg"));
      
      return d;
    }
    
    
    
    protected static ImageIcon createImageIcon(String path)
    {
    java.net.URL imgURL = BreakfastMenu.class.getResource(path);
    if(imgURL != null)
    {return new ImageIcon(imgURL);}
    else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
    }
    
    private void EntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntreeActionPerformed
        
       
    }//GEN-LAST:event_EntreeActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

            JOptionPane.showMessageDialog(null,"Thanks, Your order will be out shortly!");
        
       /** try{
            // Get info from GUI
            String sql = "Insert into Ticket (ID,Item1,Item2,Item3,Item4,Drinks)" +" values (?,?,?,?,?,?)";
            myrun = DriverManager.getConnection("jdbc:derby://localhost:1527/FoodDude_DB","Davion","drcouncil");
           PreparedStatement stm = myrun.prepareStatement(sql);
           stm.setString(1, IDnum.getText());
           
           String num1= item1.getSelectedItem().toString();
           stm.setString(2, num1);
           
           String num2= item2.getSelectedItem().toString();
           stm.setString(3, num2);
           
           String num3= item3.getSelectedItem().toString();
           stm.setString(4, num3);
           
           String num4= item4.getSelectedItem().toString();
           stm.setString(5, num4);
           
           //String num2= .getSelectedItem().toString();
           //stm.setString(6, drink.getText());
           
           
          //stm = myrun.prepareStatement(sql);
          
          
            
            
            
            stm.execute();
            
           
            pst.setString(1)
            String id = IDnum.getText();
            String num1= item1.getSelectedItem().toString();
            String num2= item2.getSelectedItem().toString();
            String num3= item3.getSelectedItem().toString();
            String num4= item4.getSelectedItem().toString();
            String drink= DrinkList.getSelectedValue();
            **/
        
        
        // Add info to sql database .. (column number, variable that holds txt)
        
        /**add.setString(1,id);
        add.setString(2, num1);
        add.setString(3, num2);
        add.setString(4, num3);
        add.setString(5, num4);
        add.setString(6, drink);
        
        int row = add.executeUpdate();
        
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }**/
    }//GEN-LAST:event_addButtonActionPerformed

    
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

dispose();
new MenuPrompt().setVisible(true);
              // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void WaitressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaitressButtonActionPerformed
 JOptionPane.showMessageDialog(null," A waitress is on the way!");        // TODO add your handling code here:
    }//GEN-LAST:event_WaitressButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BreakfastMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BreakfastMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BreakfastMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BreakfastMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BreakfastMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Entree;
    private javax.swing.JButton WaitressButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void add(String[] entree, String PAGE_START) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
