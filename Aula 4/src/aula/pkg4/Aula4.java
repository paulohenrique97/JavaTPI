/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author a06164358
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    static void calcSoma(double a, double b) {
        double soma = a + b;
        JOptionPane.showMessageDialog(null,"A soma é: " + soma);
    }

    static void calcSub(double a, double b) {
        double subtracao = a - b;
        JOptionPane.showMessageDialog(null,"A subtração é: " + subtracao);
    }

    static void calcMult(double a, double b) {
        double multiplicacao = a * b;
        JOptionPane.showMessageDialog(null,"A multiplicação é: " + multiplicacao);
    }

    static void calcDiv(double a, double b) {
        double divisao = a / b;
        JOptionPane.showMessageDialog(null,"A divisão é: " + divisao);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculadora: ");
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira outro número: "));        
        calcSoma(x,y);
        calcSub(x,y);
        calcMult(x,y);
        calcDiv(x,y);
    }

}
