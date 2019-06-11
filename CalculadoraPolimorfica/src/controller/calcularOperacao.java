/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import view.frmCalculadora;

/**
 *
 * @author aluno
 */
public class calcularOperacao {

    public void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        try {
            frmCalculadora.jLabel2.setText("Resultado: " + operacao.calcular(x, y));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
