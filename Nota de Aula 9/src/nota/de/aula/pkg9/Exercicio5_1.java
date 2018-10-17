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
public class Exercicio5_1 {
    
     
    public static int cubo(){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro: "));
        int cubo=1;
        for (int i=0;i<3;i++){
            cubo=cubo*x;
        }
        return cubo;
    }
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "O cubo de  é: "+cubo());
    }
    
}
