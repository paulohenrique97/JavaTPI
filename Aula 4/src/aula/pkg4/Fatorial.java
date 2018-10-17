/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author a06164358
 */
public class Fatorial {

    static int calcFat(int a) {
        int b = a;
        while (a > 1) {
            b = b * (a - 1);
            a = a - 1;
        }
        return b;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número: "));
        JOptionPane.showMessageDialog(null, "O fatorial de " + x + " é: " + calcFat(x));
    }

}
