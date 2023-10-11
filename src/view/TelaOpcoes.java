/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class TelaOpcoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaOpcoes
     */
    public TelaOpcoes() {
        initComponents();
        geraAcessbilidade();
    }
    
    public void geraAcessbilidade(){
        btnFinalizar.setMnemonic(KeyEvent.VK_F);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        radioPorsche = new javax.swing.JRadioButton();
        radioBMW = new javax.swing.JRadioButton();
        radioHB20 = new javax.swing.JRadioButton();
        radioFiat = new javax.swing.JRadioButton();
        radioOnix = new javax.swing.JRadioButton();
        radioFusca = new javax.swing.JRadioButton();
        radioKombi = new javax.swing.JRadioButton();
        radioOpala = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Opções de escolha");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Automóveis luxuosos:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Automóveis populares:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Automóveis clássicos:");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.setNextFocusableComponent(radioPorsche);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        radioPorsche.setText("Porsche 911");
        radioPorsche.setNextFocusableComponent(radioBMW);
        radioPorsche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPorscheActionPerformed(evt);
            }
        });

        radioBMW.setText("BMW X1");
        radioBMW.setNextFocusableComponent(radioHB20);
        radioBMW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBMWActionPerformed(evt);
            }
        });

        radioHB20.setText("Hyundai HB20 sense 1.0");
        radioHB20.setNextFocusableComponent(radioFiat);
        radioHB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHB20ActionPerformed(evt);
            }
        });

        radioFiat.setText("Fiat cronos 1.0");
        radioFiat.setNextFocusableComponent(radioOnix);
        radioFiat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFiatActionPerformed(evt);
            }
        });

        radioOnix.setText("Chevrolet Onix Plus LT 1.0");
        radioOnix.setNextFocusableComponent(radioFusca);
        radioOnix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOnixActionPerformed(evt);
            }
        });

        radioFusca.setText("Volkswagen Fusca");
        radioFusca.setNextFocusableComponent(radioKombi);
        radioFusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFuscaActionPerformed(evt);
            }
        });

        radioKombi.setText("Volkswagen Kombi");
        radioKombi.setNextFocusableComponent(radioOpala);
        radioKombi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioKombiActionPerformed(evt);
            }
        });

        radioOpala.setText("Chevrolet Opala");
        radioOpala.setNextFocusableComponent(btnFinalizar);
        radioOpala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOpalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioOpala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(radioBMW)
                            .addComponent(radioPorsche)
                            .addComponent(radioFusca)
                            .addComponent(radioKombi)
                            .addComponent(radioHB20)
                            .addComponent(radioFiat)
                            .addComponent(radioOnix))
                        .addGap(0, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(radioPorsche)
                .addGap(18, 18, 18)
                .addComponent(radioBMW)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(radioHB20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioFiat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOnix)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(radioFusca)
                .addGap(12, 12, 12)
                .addComponent(radioKombi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioOpala)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        dispose();
        JOptionPane.showMessageDialog(null, "Carro escolhido com sucesso!");
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void radioPorscheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPorscheActionPerformed
        // TODO add your handling code here:
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioPorscheActionPerformed

    private void radioBMWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBMWActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioBMWActionPerformed

    private void radioHB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHB20ActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioHB20ActionPerformed

    private void radioFiatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFiatActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioFiatActionPerformed

    private void radioOnixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOnixActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioOnixActionPerformed

    private void radioFuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFuscaActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioKombi.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioFuscaActionPerformed

    private void radioKombiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioKombiActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioOpala.setSelected(false);
    }//GEN-LAST:event_radioKombiActionPerformed

    private void radioOpalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOpalaActionPerformed
        // TODO add your handling code here:
        radioPorsche.setSelected(false);
        radioBMW.setSelected(false);
        radioHB20.setSelected(false);
        radioFiat.setSelected(false);
        radioOnix.setSelected(false);
        radioFusca.setSelected(false);
        radioKombi.setSelected(false);
    }//GEN-LAST:event_radioOpalaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioBMW;
    private javax.swing.JRadioButton radioFiat;
    private javax.swing.JRadioButton radioFusca;
    private javax.swing.JRadioButton radioHB20;
    private javax.swing.JRadioButton radioKombi;
    private javax.swing.JRadioButton radioOnix;
    private javax.swing.JRadioButton radioOpala;
    private javax.swing.JRadioButton radioPorsche;
    // End of variables declaration//GEN-END:variables
}
