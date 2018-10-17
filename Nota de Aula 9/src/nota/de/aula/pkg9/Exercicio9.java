/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.de.aula.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author a06164358
 */
public class Exercicio9 {
       
    public static double le;

    public static void leitura(String texto) {
        le = (Double.parseDouble(JOptionPane.showInputDialog(null, texto)));
    }
    
    public static double media(double x, double y, double z) {
        double media;
        media = (x + y + z) / 3;
        return media;
    }

    public static void main(String[] args) {
        double x, y, z;
        leitura("Insira um valor: ");
        x = le;
        leitura("Insira um segundo valor: ");
        y = le;
        leitura("Insira um terceiro valor: ");
        z = le;
        JOptionPane.showMessageDialog(null, "A média dos números é: " + media(x, y, z));

    }

}
