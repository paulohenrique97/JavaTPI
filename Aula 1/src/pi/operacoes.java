/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import static pi.conversao.conversaoDecimal;

/**
 *
 * @author Paulo
 */
public class operacoes {
    
    public static int soma(int num[], int num1[]){
        return conversaoDecimal(num) + conversaoDecimal(num1);
    }
    
    public static int subtracao(int num[], int num1[]){
        return conversaoDecimal(num) - conversaoDecimal(num1);
    }
    
}
