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
public class Exercicio3 {

    static int le;

    public static void leitura(String texto) {
        le = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
    }

    public static int cubo(int x) {
        int cubo = 1;
        for (int i = 0; i < 3; i++) {
            cubo = cubo * x;
        }
        return cubo;
    }

    public static void main(String[] args) {
        int N;
        JOptionPane.showMessageDialog(null, "Cubo de um número inteiro:");
        leitura("Insira um número inteiro: ");
        N = le;
        JOptionPane.showMessageDialog(null, "O cubo de " + N + " é: " + cubo(N));
    }

}
