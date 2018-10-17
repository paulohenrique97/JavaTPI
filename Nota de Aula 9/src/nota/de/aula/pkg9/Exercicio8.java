/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.de.aula.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Exercicio8 {

    static String vetor;
    static double a[] = new double[30];

    static void leitura(double x[]) {
        for (int i = 0; i < 30; i++) {
            x[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da posição " + (i + 1) + " : "));
        }
    }

    static void METADE(double x[]) {
        for (int i = 0; i < 30; i++) {
            x[i] = x[i] / 2;
        }
    }

    static void printVetor(double x[]) {
        vetor = ("|");
        for (int i = 0; i < 30; i++) {
            vetor = (vetor + x[i] + "|");
        }
        JOptionPane.showMessageDialog(null, vetor);
    }

    public static void main(String[] args) {        
        leitura(a);
        METADE(a);
        printVetor(a);
    }
}