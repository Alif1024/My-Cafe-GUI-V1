/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycafegui;

import javax.swing.JOptionPane;

/**
 *
 * @author nural
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JToggleButton();
        btnMyCafe2 = new javax.swing.JToggleButton();
        btnAbout1 = new javax.swing.JToggleButton();
        btnCredits1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(253, 203, 110));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit1.setBackground(new java.awt.Color(255, 153, 0));
        btnExit1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 255, 255));
        btnExit1.setText("EXIT");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 40));

        btnMyCafe2.setBackground(new java.awt.Color(255, 153, 0));
        btnMyCafe2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMyCafe2.setForeground(new java.awt.Color(255, 255, 255));
        btnMyCafe2.setText("MY CAFE");
        btnMyCafe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCafe2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyCafe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 40));

        btnAbout1.setBackground(new java.awt.Color(255, 153, 0));
        btnAbout1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAbout1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout1.setText("ABOUT");
        btnAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbout1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAbout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 40));

        btnCredits1.setBackground(new java.awt.Color(255, 153, 0));
        btnCredits1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCredits1.setForeground(new java.awt.Color(255, 255, 255));
        btnCredits1.setText("CREDITS");
        btnCredits1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCredits1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCredits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -70, 250, 410));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Do You Want To Exit?","EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnMyCafe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCafe2ActionPerformed
        // TODO add your handling code here:
        if(btnMyCafe2.isSelected()) {
            menu newMenu = new menu();
            newMenu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnMyCafe2ActionPerformed

    private void btnAbout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbout1ActionPerformed
        // TODO add your handling code here:
        if(btnAbout1.isSelected()) {
            about newAbout = new about();
            newAbout.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAbout1ActionPerformed

    private void btnCredits1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCredits1ActionPerformed
        // TODO add your handling code here:
        credits newCredits = new credits();
        newCredits.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCredits1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAbout1;
    private javax.swing.JToggleButton btnCredits1;
    private javax.swing.JToggleButton btnExit1;
    private javax.swing.JToggleButton btnMyCafe2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
