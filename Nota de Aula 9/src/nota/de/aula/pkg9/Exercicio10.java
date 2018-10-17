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
public class Exercicio10 {
    
    public static void AUMENTO(double x, double y){
        double salarioFinal;
        salarioFinal = x  + x * (y/100);         
        JOptionPane.showMessageDialog(null, "O salário com aumento é: "+salarioFinal);
    }
    
    public static void main(String[] args){
        double x,y;
        x= Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número: "));
        y= Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um número: "));
        AUMENTO(x,y);
    }
    
}
