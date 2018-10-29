/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class NewClass {
    
    public static void main(String[] args){
        int soma = 0;
        for (int i = 100; i < 3001; i++){
            soma+=i;
        }
        JOptionPane.showMessageDialog(null, soma);
    }
    
}
