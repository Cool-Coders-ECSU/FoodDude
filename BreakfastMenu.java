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
import javax.swing.text.NumberFormatter;

/**
 *
 * @author drcouncil
 */
public class BreakfastMenu extends javax.swing.JFrame {
protected double entreePrice;
protected double drinkPrice;
protected double tax = 0.07;
protected double total;
protected double discount;

Connection myrun = null;
Statement mystate = null;
ResultSet myupdate = null;




    public BreakfastMenu() {
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
  
    
    
 /*  
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
    */
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entree = new javax.swing.JComboBox();
        addButton = new javax.swing.JButton();
        WaitressButton = new javax.swing.JButton();
        DrinkCombo = new javax.swing.JComboBox();
        exitButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        EntreeTitle = new javax.swing.JLabel();
        DrinkTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        picDescription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        drinkDescription = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(480, 480));
        getContentPane().setLayout(null);

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

        DrinkCombo.setModel(practice2());
        DrinkCombo.setBorder(null);
        DrinkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkComboActionPerformed(evt);
            }
        });
        getContentPane().add(DrinkCombo);
        DrinkCombo.setBounds(430, 190, 240, 210);

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
        Title.setForeground(new java.awt.Color(205, 0, 51));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Breakfast Menu:");
        getContentPane().add(Title);
        Title.setBounds(200, 20, 390, 60);

        EntreeTitle.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        EntreeTitle.setForeground(new java.awt.Color(204, 0, 51));
        EntreeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EntreeTitle.setText("ENTREE");
        getContentPane().add(EntreeTitle);
        EntreeTitle.setBounds(60, 150, 180, 40);

        DrinkTitle.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        DrinkTitle.setForeground(new java.awt.Color(204, 0, 51));
        DrinkTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DrinkTitle.setText("DRINKS");
        getContentPane().add(DrinkTitle);
        DrinkTitle.setBounds(400, 150, 220, 30);

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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
   /* try{
myrun=DriverManager.getConnection("jdbc:derby://localhost:1527/FoodDude_DB","Davion","drcouncil");
mystate =myrun.createStatement();
        myupdate= mystate.executeQuery("Select * from Davion.fooddue");
        
        
    }
  
    catch(SQLException e)
    { e.printStackTrace(); }
*/
        
        double sum;
        sum = (entreePrice + drinkPrice) * tax;
        total = sum + entreePrice + drinkPrice;
        double t1 = total;
        
int YesOrNo = JOptionPane.showConfirmDialog(null, "Are you done with your order? Your price is $" + String.format("%.2f",total) + ".","Yes", JOptionPane.YES_NO_OPTION);

if(YesOrNo == 0)
{
    if(total<=0)
    {JOptionPane.showMessageDialog(null,"Sorry, Order was not processed nothing was bought!"); }
    else
    {
        //JOptionPane.showMessageDialog(null,"Thanks, Your order will be out shortly!"); 
        try 
        {
            //jdbc:derby://localhost:1527/FoodDude_DB [Davion on DAVION]
myrun=DriverManager.getConnection("jdbc:derby://localhost:1527/FoodDude_DB","Davion","drcouncil");
            String val1 = picDescription.getText();
            String val2 = drinkDescription.getText();
            
            
            String sql = "insert into Davion.fooddude (entree,drinks) value(?,?)";
            
            PreparedStatement pst = myrun.prepareStatement(sql);
            
            pst.setString(1, val1);
            pst.setString(2,val2);
            pst.execute();
            pst.close();
            
            /*mystate = myrun.prepareStatement(input);
            myupdate.set*/
            JOptionPane.showMessageDialog(null,"Thanks, Your order will be out shortly!"); 
        }
        
        catch (Exception e)
        { JOptionPane.showMessageDialog(null, "ERROR");}
        
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
        { picDescription.setText("Scramble eggs with cheese, french toast & pork bacon - $5.67");
        entreePrice = 5.67;       
        } else if(Entree.getSelectedIndex()==2)
        { picDescription.setText("Buttermilk pancakes, sausage patty & whole egg - $6.99");
        entreePrice = 6.99;
        } else if(Entree.getSelectedIndex()==3)
        { picDescription.setText("Sausage and cheese omlette with side of tomatoes - $4.99");
        entreePrice = 4.99;
        }
        
//EntreeTxtDescription.setText(Entree.getSelectedItem().toString());
//jTextArea1.setText(Entree.getSelectedItem().toString());

    }//GEN-LAST:event_EntreeActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        dispose();
        new MenuPrompt().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void DrinkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkComboActionPerformed
        if(DrinkCombo.getSelectedIndex()==0)
        { drinkDescription.setText("");
        drinkPrice = 0.00;}
        else if(DrinkCombo.getSelectedIndex()==1)
        { drinkDescription.setText("Pink Lemonade $1.07");
        drinkPrice = 1.07;
        } else if(DrinkCombo.getSelectedIndex()==2)
        { drinkDescription.setText("Lemonade $1.07");
        drinkPrice = 1.07;
        } else if(DrinkCombo.getSelectedIndex()==3)
        { drinkDescription.setText("Apple Juice - $1.07");
        drinkPrice = 1.07;
        }
    }//GEN-LAST:event_DrinkComboActionPerformed
protected DefaultComboBoxModel<Icon> practice()      
{
    
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    
    ImageIcon[] image;
    //String[] entree = {"breakfas1","breakfast2"};
    ImageIcon b0 = new ImageIcon("NONE");
    d.addElement(b0);
    ImageIcon b1 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast1.png");
    d.addElement(b1);
    ImageIcon b2 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast2.png");
   d.addElement(b2);
   ImageIcon b3 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast3n.png");
    d.addElement(b3);
    return d;
}

                                        
protected DefaultComboBoxModel<Icon> practice2()      
{
    
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    
    ImageIcon[] image;
    //String[] entree = {"breakfas1","breakfast2"};
    ImageIcon drink = new ImageIcon("NONE");
    d.addElement(drink);
    ImageIcon drink1 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink.jpg");
    d.addElement(drink1);
    ImageIcon drink2 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink2.png");
   d.addElement(drink2);
   ImageIcon drink3 = new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink3.png");
    d.addElement(drink3);
    return d;
}

/*
    protected ImageIcon createImage(String path)
    {
        ImageIcon[] images;
        String[] petstring = {"breakfast2", "breakfast1"};
        
        images = new ImageIcon[petstring.length];
    Integer [] Array = new Integer[petstring.length];
    for(int i = 0; i<petstring.length; i++)
    {
    Array[i]= new Integer(i);
    images[i] = createImage("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\" +petstring[i]+".png");
  if(images[i] != null)
  {
      images[i].setDescription(petstring[i]);
  }
    } 
        
    java.net.URL imgURL = BreakfastMenu.class.getResource(path);
    if (imgURL != null)
    { return new ImageIcon(imgURL);
    }
    else
    {System.err.println("ERROR");
    return null;
    }
    
    }
    */
    
    
    
    /*private DefaultComboBoxModel<Icon> [] loadImages()
    {
    DefaultComboBoxModel<Icon> [] d = new DefaultComboBoxModel<Icon>[]();
    
    d.addElement(new ImageIcon(""));
  d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast3.jpg"));
 d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast2.png"));
  d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\breakfast1.png"));
  
      
      
      return d;
    }*/
    
    
     private DefaultComboBoxModel<Icon> loadImages2()
    {
    DefaultComboBoxModel<Icon> d = new DefaultComboBoxModel<Icon>();
    //Entree
            d.addElement(new ImageIcon(""));
//d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\entree1.jpg"));    
//Entree2
     d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink.jpg"));
     d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink2.png"));
    //Entree3
    d.addElement(new ImageIcon("C:\\Users\\drcouncil\\Documents\\NetBeansProjects\\FoodDude\\src\\food_dude\\newdrink3.png"));
    
   
      
      return d;
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

    private void add(String[] entree, String PAGE_START) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
