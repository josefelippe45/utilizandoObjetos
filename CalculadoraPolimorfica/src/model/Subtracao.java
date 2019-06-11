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
public class Subtracao extends OperacaoMatematica{

   
    public double calcular(double x, double y)
    {
        return x-y;
    }
}
