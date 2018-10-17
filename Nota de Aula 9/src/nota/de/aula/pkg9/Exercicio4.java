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
public class Exercicio4 {
    
    public static int le;

    public static void leitura(String texto) {
        le = (Integer.parseInt(JOptionPane.showInputDialog(null, texto)));
    }    
    
    public static int cubo(int x) {
        int cubo = 1;
        for (int i = 0; i < 3; i++) {
            cubo = cubo * x;
        }
        return cubo;
    }

    public static double volume(int x) {
        double volume = (12.56 * cubo(x))/3;
        return volume;
    }

    public static int equacao(int x, int y) {
        int equacao = cubo(x) + cubo(y) + 2;
        return equacao;
    }

    public static void main(String[] args) {
        int x, y;
        JOptionPane.showMessageDialog(null, "Volume de uma esfera de raio X");
        leitura("Insira o raio: ");
        x = le;
        JOptionPane.showMessageDialog(null, "Volume é: " + volume(x));
        JOptionPane.showMessageDialog(null, "Resolução da equação x³+y³+2");
        leitura("Insira X:");
        x = le;
        leitura("Insira Y:");
        y = le;
        JOptionPane.showMessageDialog(null, "A equação resulta: " + equacao(x, y));
    }
}
