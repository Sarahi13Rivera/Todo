/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21550867_colores_u1_dm;

import java.awt.Color;

/**
 *
 * @author HP1000
 */
public class pantallaPricipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPricipal
     */
    public pantallaPricipal() {
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

        bRojo = new javax.swing.JButton();
        bVerde = new javax.swing.JButton();
        bAzul = new javax.swing.JButton();
        bAmarillo = new javax.swing.JButton();
        txtcolor = new javax.swing.JTextField();
        txtEscribir = new javax.swing.JTextField();
        txtPintura = new javax.swing.JTextField();
        btnPintar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bRojo.setText("Rojo");
        bRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRojoActionPerformed(evt);
            }
        });

        bVerde.setText("Verde");
        bVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerdeActionPerformed(evt);
            }
        });

        bAzul.setText("Azul");
        bAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAzulActionPerformed(evt);
            }
        });

        bAmarillo.setText("Amarillo");
        bAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAmarilloActionPerformed(evt);
            }
        });

        txtcolor.setEditable(false);
        txtcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolorActionPerformed(evt);
            }
        });

        txtEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscribirActionPerformed(evt);
            }
        });

        txtPintura.setEditable(false);

        btnPintar.setText("Pintar");
        btnPintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPintarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bRojo)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bVerde)
                                        .addGap(55, 55, 55)
                                        .addComponent(bAzul)
                                        .addGap(41, 41, 41)
                                        .addComponent(bAmarillo))
                                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txtPintura, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnPintar)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRojo)
                    .addComponent(bVerde)
                    .addComponent(bAzul)
                    .addComponent(bAmarillo))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPintar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRojoActionPerformed
txtcolor.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_bRojoActionPerformed

    private void bAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAzulActionPerformed
        // TODO add your handling code here:
        txtcolor.setBackground(Color.blue);
        
    }//GEN-LAST:event_bAzulActionPerformed

    private void txtcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolorActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolorActionPerformed

    private void bVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerdeActionPerformed
txtcolor.setBackground(Color.green);        // TODO add your handling code here:
    }//GEN-LAST:event_bVerdeActionPerformed

    private void bAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAmarilloActionPerformed
        // TODO add your handling code here:
        txtcolor.setBackground(Color.yellow);
    }//GEN-LAST:event_bAmarilloActionPerformed

    private void btnPintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPintarActionPerformed
     String sColor=txtEscribir.getText();
     if(sColor.equalsIgnoreCase("rojo")){
         txtPintura.setBackground(Color.red);
     }
          if(sColor.equalsIgnoreCase("verde")){
        
         txtPintura.setBackground(Color.green); 
         
     }
      if(sColor.equalsIgnoreCase("azul")){
         txtPintura.setBackground(Color.blue);  
      }
          if(sColor.equalsIgnoreCase("amarillo")){
         txtPintura.setBackground(Color.yellow);  
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPintarActionPerformed

    private void txtEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscribirActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAmarillo;
    private javax.swing.JButton bAzul;
    private javax.swing.JButton bRojo;
    private javax.swing.JButton bVerde;
    private javax.swing.JButton btnPintar;
    private javax.swing.JTextField txtEscribir;
    private javax.swing.JTextField txtPintura;
    private javax.swing.JTextField txtcolor;
    // End of variables declaration//GEN-END:variables
}
