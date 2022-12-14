/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21550374_preexamen_u3_md;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio Rivero
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        String[] arrayTamaño = new String[] {"Seleccionar","Grande", "Mediana", "Chica"};
        cmbTamañoPizza.setModel(new DefaultComboBoxModel (arrayTamaño));
        
        String[] arrayTipo = new String[] {"Seleccionar","Original","Italiana", "Al sartén", "Orilla de queso"};
        cmbTipoPizza.setModel(new DefaultComboBoxModel(arrayTipo));
        
        lblTipoPizza.setVisible(false);
        cmbTipoPizza.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTamañoPizza = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTipoPizza = new javax.swing.JLabel();
        cmbTipoPizza = new javax.swing.JComboBox<>();
        rbtnPepperoni = new javax.swing.JRadioButton();
        rbtnJamon = new javax.swing.JRadioButton();
        rbtnQueso = new javax.swing.JRadioButton();
        rbtnSalami = new javax.swing.JRadioButton();
        rbtnPiña = new javax.swing.JRadioButton();
        rbtnCereza = new javax.swing.JRadioButton();
        rbtnSalchicha = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnCostoFinal = new javax.swing.JButton();
        lblCostoFinal = new javax.swing.JLabel();
        rbtnExtraQueso = new javax.swing.JRadioButton();
        txtTamaño = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnSalida = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblTotalIngredientes = new javax.swing.JLabel();
        btnTotalIngredientes = new javax.swing.JButton();
        btnTotalPizza = new javax.swing.JButton();
        lblTotalPizza = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTamañoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTamañoPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTamañoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tamaño de la Pizza:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel2.setText("Pizza's");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 170, 40));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel3.setText("La Lupe ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Favor de escoger su pizza a su preferencia: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblTipoPizza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoPizza.setText("Tipo: ");
        getContentPane().add(lblTipoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        cmbTipoPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, -1));

        rbtnPepperoni.setText("Pepperoni $10 pesos");
        rbtnPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPepperoniActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        rbtnJamon.setText("Jamón $10 pesos");
        getContentPane().add(rbtnJamon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        rbtnQueso.setText("Queso $10 pesos");
        getContentPane().add(rbtnQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        rbtnSalami.setText("Salami $10 pesos");
        getContentPane().add(rbtnSalami, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        rbtnPiña.setText("Piña $10 pesos");
        getContentPane().add(rbtnPiña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        rbtnCereza.setText("Cereza $20 pesos");
        getContentPane().add(rbtnCereza, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        rbtnSalchicha.setText("Salchicha $10 pesos");
        rbtnSalchicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSalchichaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnSalchicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Favor de escoger sus ingredientes:  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnCostoFinal.setText("Costo final de la pizza es: ");
        btnCostoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCostoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, -1));

        lblCostoFinal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        getContentPane().add(lblCostoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 150, 50));

        rbtnExtraQueso.setText("Extra Queso $20 pesos");
        getContentPane().add(rbtnExtraQueso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));
        getContentPane().add(txtTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, -1));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, -1));

        btnSalida.setText("Salir");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 690, -1, -1));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        lblTotalIngredientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTotalIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 110, 40));

        btnTotalIngredientes.setText("Ver el total de los ingredientes");
        btnTotalIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotalIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        btnTotalPizza.setText("Total de la pizza sin ingredientes:");
        btnTotalPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPizzaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotalPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        lblTotalPizza.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTotalPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/practicaPizza/menu3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnSalchichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSalchichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSalchichaActionPerformed

    private void btnCostoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoFinalActionPerformed
        // TODO add your handling code here:
        lblCostoFinal.setVisible(true);
        int sCostoFinal; 
        int sTotalPizza = Integer.parseInt(lblTotalPizza.getText());
        int sTotalIngredientes = Integer.parseInt(lblTotalIngredientes.getText());
        sCostoFinal=sTotalIngredientes+sTotalPizza;
        lblCostoFinal.setText(String.valueOf(sCostoFinal));
    }//GEN-LAST:event_btnCostoFinalActionPerformed

    private void cmbTamañoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTamañoPizzaActionPerformed
        // TODO add your handling code here:
        lblTipoPizza.setVisible(true);
        cmbTipoPizza.setVisible(true);
        String sTamaño = cmbTamañoPizza.getSelectedItem().toString();
        String[] arrayTamaño=null;
        switch(sTamaño){
            case "Grande":
                txtTamaño.setVisible(true);
                txtTamaño.setText("110");
                break;
            case "Mediana":
                txtTamaño.setVisible(true);
                txtTamaño.setText("90");
                break;
            case "Chica":
                txtTamaño.setVisible(true);
                txtTamaño.setText("80");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona un tamaño para continuar", "Error de selección", JOptionPane.ERROR_MESSAGE );
        }
        
    }//GEN-LAST:event_cmbTamañoPizzaActionPerformed

    private void cmbTipoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPizzaActionPerformed
        // TODO add your handling code here:
        String sTipo = cmbTipoPizza.getSelectedItem().toString();
        String[] arrayTipo=null;
        switch(sTipo){
            case "Original":
                txtTipo.setVisible(true);
                txtTipo.setText("10");
                break;
            case "Italiana":
                txtTipo.setVisible(true);
                txtTipo.setText("20");
                break;
            case "Al sartén":
                txtTipo.setVisible(true);
                txtTipo.setText("35");
                break;
            case "Orilla de queso":
                txtTipo.setVisible(true);
                txtTipo.setText("45");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona el tipo de pizza para continuar", "Error de selección", JOptionPane.ERROR_MESSAGE );
        }
        
    }//GEN-LAST:event_cmbTipoPizzaActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        txtTipo.setText("");
        txtTamaño.setText("");
        cmbTamañoPizza.setSelectedIndex(0);
        cmbTipoPizza.setSelectedIndex(0);
     
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void rbtnPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPepperoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPepperoniActionPerformed

    private void btnTotalIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalIngredientesActionPerformed
        // TODO add your handling code here:
        lblTotalIngredientes.setVisible(true);
        
        int sTotalIngredientes=0;
        if(rbtnPepperoni.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnJamon.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnQueso.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnSalami.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnPiña.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnCereza.isSelected()){
            sTotalIngredientes=sTotalIngredientes+20;
        }
        if(rbtnSalchicha.isSelected()){
            sTotalIngredientes=sTotalIngredientes+10;
        }
        if(rbtnExtraQueso.isSelected()){
            sTotalIngredientes=sTotalIngredientes+20;
        }
        lblTotalIngredientes.setText(String.valueOf(sTotalIngredientes));
    }//GEN-LAST:event_btnTotalIngredientesActionPerformed

    private void btnTotalPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPizzaActionPerformed
        // TODO add your handling code here:int sTamaño = Integer.parseInt(txtTamaño.getText());
        lblTotalPizza.setVisible(true);
        int sTipo = Integer.parseInt(txtTipo.getText());
        int sTamaño=Integer.parseInt(txtTamaño.getText());
        int sTotalPizza;
        sTotalPizza=sTipo+sTamaño;
        lblTotalPizza.setText(String.valueOf(sTotalPizza));
    }//GEN-LAST:event_btnTotalPizzaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostoFinal;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnTotalIngredientes;
    private javax.swing.JButton btnTotalPizza;
    private javax.swing.JComboBox<String> cmbTamañoPizza;
    private javax.swing.JComboBox<String> cmbTipoPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCostoFinal;
    private javax.swing.JLabel lblTipoPizza;
    private javax.swing.JLabel lblTotalIngredientes;
    private javax.swing.JLabel lblTotalPizza;
    private javax.swing.JRadioButton rbtnCereza;
    private javax.swing.JRadioButton rbtnExtraQueso;
    private javax.swing.JRadioButton rbtnJamon;
    private javax.swing.JRadioButton rbtnPepperoni;
    private javax.swing.JRadioButton rbtnPiña;
    private javax.swing.JRadioButton rbtnQueso;
    private javax.swing.JRadioButton rbtnSalami;
    private javax.swing.JRadioButton rbtnSalchicha;
    private javax.swing.JTextField txtTamaño;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
