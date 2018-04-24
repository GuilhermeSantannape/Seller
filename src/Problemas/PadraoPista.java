/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas;

import Log.ArquivoLog;
import java.util.Date;
import javax.swing.JOptionPane;
import datastructures.ListaEncadeada;
import Model.Clientes;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.awt.Desktop;
import java.net.URI;
import seller.TelaDirecionamento;

/**
 *
 * @author Guilherme Santanna
 */
public class PadraoPista extends javax.swing.JFrame {
    
   
    public PadraoPista() {
        initComponents();
      
    }
  
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(271, 271));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Tela inicial");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jButton8.setText("Abastecimentos não caem");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, 30));

        jButton9.setText("Troca de Tanque");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 180, 30));

        jButton1.setText("Ajuda");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, -1));

        jButton2.setText("Troca de Bico");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, -1));

        jButton3.setText("Base Zerada Selbox");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

        TelaDirecionamento TelaCadastro = new TelaDirecionamento();
        TelaCadastro.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
              Desktop d = Desktop.getDesktop();
try{
   d.browse(new URI("https://share.linx.com.br/display/POSTOSSUPORTE/Acessando+o+aplicativo+do+CBCManager"));
}
catch(Exception e){
   e.printStackTrace();
}
        
        
    }//GEN-LAST:event_jButton9MouseClicked

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
            java.util.logging.Logger.getLogger(PadraoPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PadraoPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PadraoPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PadraoPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PadraoPista().setVisible(true);
                
            }
            
        });
        
        
    }
    
 private static final String cnpj = "";
private static final String site = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

 
}
