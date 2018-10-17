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
public class Exercicio6 {
    
    public static int le;

    public static void leitura(String texto) {
        le = (Integer.parseInt(JOptionPane.showInputDialog(null, texto)));
    }
    
    public static int POTENCIA(int x, int y){
        int resultado=1;
        while (y>0){
            resultado=resultado*x;
            y--;
        }
        return resultado;
    }
    
    public static void main(String[] args){
        int base, expoente;
        JOptionPane.showMessageDialog(null, "Potencia: ");
        leitura("Insira a base: ");
        base=le;
        leitura("Insira o expoente: ");
        expoente=le;
        JOptionPane.showMessageDialog(null, base+" elevado à "+expoente+" é: "+POTENCIA(base,expoente));
    }    
    
}