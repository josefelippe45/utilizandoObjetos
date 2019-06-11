/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.OperacaoMatematica;

/**
 *
 * @author aluno
 */
public class Divisao extends OperacaoMatematica {

    public double calcular(double x, double y) {
        double r;
        if (y == 0) {

            throw new IllegalArgumentException("Não pode haver divisão por zero!");
        } else if (x == 0) {

            throw new IllegalArgumentException("Não pode haver divisão por zero!");
        } else {
            r = x / y;
        }
        return r;
    }
}
