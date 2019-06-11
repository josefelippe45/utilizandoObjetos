package view;

import controller.OperacaoMatematica;
import controller.calcularOperacao;
import javax.swing.JOptionPane;
import model.Divisao;
import model.Multiplicacao;
import model.Soma;
import model.Subtracao;

public class frmCalculadora extends javax.swing.JFrame {

    public frmCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(415,300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdoDiv = new javax.swing.JRadioButton();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        rdoSoma = new javax.swing.JRadioButton();
        rdoSub = new javax.swing.JRadioButton();
        btnCalc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoMult = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rdoDiv);
        rdoDiv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoDiv.setText("Divisão");
        getContentPane().add(rdoDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 97, -1, -1));

        txtNum1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 196, 22));

        txtNum2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 196, 22));

        buttonGroup1.add(rdoSoma);
        rdoSoma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoSoma.setText("Soma");
        getContentPane().add(rdoSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 66, -1, -1));

        buttonGroup1.add(rdoSub);
        rdoSub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoSub.setText("Subtração");
        getContentPane().add(rdoSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 97, -1, -1));

        btnCalc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, 370, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Calculadora");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, 370, 20));

        buttonGroup1.add(rdoMult);
        rdoMult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoMult.setText("Multiplicação");
        getContentPane().add(rdoMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 66, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Póxima Calculadora");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        try {
            calcularOperacao op = new calcularOperacao();
            if (rdoSoma.isSelected() == true) {
                op.mostrarCalculo(new Soma(), Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()));
            } else if (rdoSub.isSelected() == true) {
                op.mostrarCalculo(new Subtracao(), Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()));
            } else if (rdoMult.isSelected() == true) {
                op.mostrarCalculo(new Multiplicacao(), Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()));
            } else if (rdoDiv.isSelected() == true) {
                op.mostrarCalculo(new Divisao(), Integer.parseInt(txtNum1.getText()), Integer.parseInt(txtNum2.getText()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Caracteres inválidos !", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new frmCalcOverload().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    public class jLabel2 {

        public jLabel2() {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdoDiv;
    private javax.swing.JRadioButton rdoMult;
    private javax.swing.JRadioButton rdoSoma;
    private javax.swing.JRadioButton rdoSub;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
