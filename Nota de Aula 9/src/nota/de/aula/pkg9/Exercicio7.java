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
public class Exercicio7 {
    
    public static int le;
    public static int x;
    public static int y;

    public static void leitura(String texto) {
        le = (Integer.parseInt(JOptionPane.showInputDialog(null, texto)));
    }
    
    public static void TROCA(){
        int bkp_x;
        bkp_x=x;
        x=y;
        y=bkp_x;
    }
    
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Troca de valores");
        leitura("Insira X: ");
        x=le;
        leitura("Insira Y: ");
        y=le;
        TROCA();
        JOptionPane.showMessageDialog(null, "X virou: "+x);
        JOptionPane.showMessageDialog(null, "Y virou: "+y);
    }
    
}
