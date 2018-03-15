/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seller;

import Log.ArquivoLog;
import java.util.Date;
import javax.swing.JOptionPane;
import datastructures.ListaEncadeada;
import Model.Clientes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import comparators.SearchBySite;
import comparators.SearchByCnpj;

/**
 *
 * @author Guilherme Santanna
 */
public class seller extends javax.swing.JFrame {
    
   
    public seller() {
        initComponents();
      
    }
  
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(500, 283));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Salvar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma das opçoes>", "PDV", "Sync", "Pista", "Cadastro de produtos", "Nfe", "Comanda", "LMC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 230, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 30));

        jLabel4.setText("CNPJ:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 30));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 140, 30));

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 30));

        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 30));

        jLabel1.setText("Site:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 30, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 260, 110));

        jLabel5.setText("Descrição do problema");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 230, 30));

        jLabel6.setText("Titulo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, -1));

        jTextField5.setEnabled(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField5MouseReleased(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 260, 30));

        jLabel7.setText("Detalhe do problema");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, 20));

        jTextField6.setEnabled(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 260, 90));

        jButton2.setText("Salvar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jButton3.setText("Limpar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      if(this.jComboBox1.getSelectedItem().toString().equals("PDV")){   
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Modo de Consulta");
                jComboBox2.addItem("Falha de Comunicação com a DLL");
                jComboBox2.addItem("Falha no MIDe");
                jComboBox2.addItem("Reinstalação");
                jComboBox2.addItem("Instalação");
                } 
      
      if(this.jComboBox1.getSelectedItem().toString().equals("<Selecione uma das opçoes>")){
          jComboBox2.removeAllItems();
        
      }
      
      if(this.jComboBox1.getSelectedItem().toString().equals("Sync")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Vendas não sincronizam");
                jComboBox2.addItem("Turno não abre");
                jComboBox2.addItem("Não alterou preço");
                jComboBox2.addItem("Não baixou cadastro");
                
      }
         if(this.jComboBox1.getSelectedItem().toString().equals("Pista")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Troca de Bomba");
                jComboBox2.addItem("Troca de Tanque");
                jComboBox2.addItem("Não alterou preço");
                jComboBox2.addItem("Nao recebe as bastecimentos no pdv");
                
      }
            if(this.jComboBox1.getSelectedItem().toString().equals("Cadastro de produtos")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Cadastro de Produto");
                jComboBox2.addItem("Cadastro de Kit");
                jComboBox2.addItem("Liberar posições livres");
            }
                 if(this.jComboBox1.getSelectedItem().toString().equals("Nfe")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Fornecedor não autorizado BR MANIA");
                jComboBox2.addItem("Fornecedor não aparece depois de importar");
                jComboBox2.addItem("NFe Rejeitada");
                jComboBox2.addItem("Cancelar NFe");
                jComboBox2.addItem("NFe de Devolução");
                jComboBox2.addItem("NFe de Saída");
                jComboBox2.addItem("NFe de Substituição");     
      }
          if(this.jComboBox1.getSelectedItem().toString().equals("Comanda")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Configurar comanda.exe");
                jComboBox2.addItem("Configurar Terminal Wilbor");
                jComboBox2.addItem("Configurar Catraca");
                   
      }
              if(this.jComboBox1.getSelectedItem().toString().equals("LMC")){
          jComboBox2.removeAllItems();
                jComboBox2.addItem("Diferenças perdas e ganhos");
                jComboBox2.addItem("Lançamento de Medições");
              
                   
      }
      
           
                
        
        /*if(this.jComboBox1.getSelectedItem().toString().equals("PDV")){
    jComboBox2.addItem("Modo de Consulta");
    jComboBox2.addItem("Falha de Comunicação com a DLL");
    jComboBox2.addItem("Falha no MIDe");
    jComboBox2.addItem("Reinstalação");
    jComboBox2.addItem("Instalação");*/
    
       // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here
       /* ListaEncadeada();
       Clientes Clientes = new Clientes();
        if(jTextField3.getText().equals(Clientes.getCnpj())){
            jTextField4.setText(Clientes.setSite(Site));
        }*/
        
        
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseReleased

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
       // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
  jTextArea1.setEnabled(false);
   jTextField5.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
  jTextArea1.setEnabled(false);
   jTextField5.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
       jTextField5.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
  jTextArea1.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      Clientes cliente= new Clientes();               
        
        
        FileReader arquivo = null;
      try {
			arquivo = new FileReader("Contatos.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
        ListaEncadeada lista =  ListaEncadeada.loadFromFile(arquivo);
                
        Clientes busca = new Clientes(cnpj, site);
           System.out.println(lista.search(busca, new SearchByCnpj()));
        System.out.println(lista.search(busca, new SearchBySite()));
     
      
     
      
		
               /*
      
        
        if(jComboBox1.getSelectedItem().equals("<Selecione uma das opçoes>")){
            JOptionPane.showMessageDialog(null, "Selecione uma das opçoes!", "Erro", JOptionPane.ERROR_MESSAGE);
            jTextField5.setText("");
            jTextArea1.setText("");
            jTextArea1.setEnabled(false);
            jTextField5.setEnabled(false);
            jTextField6.setEnabled(false);

            return;

        }else

        
        jTextField5.setText((String) jComboBox2.getSelectedItem()); {
            jTextArea1.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField6.setEnabled(true);

            jTextField5.setText((String) jComboBox2.getSelectedItem());
            Date dataAtual = new Date();

            jTextArea1.setText(jTextField1.getText()
                +" informa erro "+jComboBox2.getSelectedItem()
                +"\nNome: "+jTextField1.getText()
                +"\nTelefone: "+jTextField2.getText()
                +"\nCnpj:"+jTextField3.getText()
                +"\nSite: "+jTextField4.getText()
                
                  );
                
                 
                
                
            /// responsavel por gravar informações

            new ArquivoLog(dataAtual+" "+jComboBox2.getSelectedItem()
                +" Nome: " +jTextField1.getText()
                +" Telefone: "+jTextField2.getText()+
                " Cnpj:"+jTextField3.getText()
                +" Site: "+jTextField4.getText());//Resposavel por gravar log

        }
*/
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        jTextField5.setText("");
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
    jTextField6.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_jTextField3FocusLost

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
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seller().setVisible(true);
                
            }
            
        });
        
    }
 private static final String cnpj = "";
private static final String site = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
