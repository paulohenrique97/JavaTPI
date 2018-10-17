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
public class Exercicio2 {
    
    public static int le;

    public static void leitura(String texto) {
        le = (Integer.parseInt(JOptionPane.showInputDialog(null, texto)));
    }

    public static float calculo(int x, int y) {
        float area;
        area = (x * y) / 2;
        return area;
    }

    public static void main(String[] args) {
        int base, altura;
        JOptionPane.showMessageDialog(null, "Área de um triângulo: ");
        leitura("Qual a base?");
        base=le;
        leitura("Qual a altura?");
        altura=le;
        JOptionPane.showMessageDialog(null, "A área é: " + calculo(base, altura));
    }

}
