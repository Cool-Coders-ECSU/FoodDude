package food_dude;


import fooddude.Main;
import food_dude.BreakfastMenu;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;



/**
 *
 * @author drcouncil
 */
public class MenuPrompt extends javax.swing.JFrame {
 
    
    public MenuPrompt() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        BreakfastButton = new javax.swing.JButton();
        LunchButton = new javax.swing.JButton();
        DinnerButton = new javax.swing.JButton();
        Tiitle = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoolCoders");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 380));
        getContentPane().setLayout(null);

        BreakfastButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        BreakfastButton.setForeground(new java.awt.Color(204, 0, 51));
        BreakfastButton.setText("Breakfast");
        BreakfastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakfastButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BreakfastButton);
        BreakfastButton.setBounds(80, 190, 140, 30);

        LunchButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        LunchButton.setForeground(new java.awt.Color(204, 0, 51));
        LunchButton.setText("Lunch");
        LunchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LunchButton);
        LunchButton.setBounds(380, 190, 140, 30);

        DinnerButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        DinnerButton.setForeground(new java.awt.Color(204, 0, 51));
        DinnerButton.setText("Dinner");
        DinnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinnerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DinnerButton);
        DinnerButton.setBounds(240, 270, 140, 30);

        Tiitle.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        Tiitle.setForeground(new java.awt.Color(255, 255, 0));
        Tiitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiitle.setText("Welcome to FoodDude!");
        getContentPane().add(Tiitle);
        Tiitle.setBounds(90, 20, 440, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_green-HD[1].jpg"))); // NOI18N
        Background.setText("jLabel3");
        Background.setMaximumSize(new java.awt.Dimension(960, 960));
        Background.setMinimumSize(new java.awt.Dimension(480, 480));
        Background.setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 730, 940);
        Background.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BreakfastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakfastButtonActionPerformed
BreakfastMenu Info = new BreakfastMenu();
Info.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_BreakfastButtonActionPerformed

    private void DinnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinnerButtonActionPerformed
DinnerOrder info = new DinnerOrder();
info.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_DinnerButtonActionPerformed

    private void LunchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunchButtonActionPerformed
LunchOrder info = new LunchOrder();
info.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_LunchButtonActionPerformed


    
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
            java.util.logging.Logger.getLogger(MenuPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrompt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrompt().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BreakfastButton;
    private javax.swing.JButton DinnerButton;
    private javax.swing.JButton LunchButton;
    private javax.swing.JLabel Tiitle;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    // End of variables declaration//GEN-END:variables




private void systemExit()
{
WindowEvent winClosesing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}


}
