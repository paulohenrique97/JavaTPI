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
public class Exercicio5_2 {
    
    static int le;
    
    static void leitura(String texto){
       le = Integer.parseInt(JOptionPane.showInputDialog(null, texto)); 
    }

    static int diasVividos(int anos) {
        int diasVividos;        
        diasVividos = anos * 365;
        return diasVividos;
    }

    public static void main(String[] args) {
        int dias, idade;
        leitura("Qual a sua idade?");
        idade = le;
        dias = diasVividos(idade);
        JOptionPane.showMessageDialog(null, "Você viveu " + dias + " dias de vida.");
    }

}
