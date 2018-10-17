/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula.pkg4;

/**
 *
 * @author a06164358
 */
public class Exemplo_Funcao {
    
    static int calcSoma(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main (String[] args){
        System.out.println("Começando o programa");
        int x = calcSoma(2,4,6)/3;
        System.out.println(x);
    }
}
