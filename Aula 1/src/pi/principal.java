/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import static pi.conversao.conversaoBinario;
import static pi.operacoes.soma;
import static pi.complemento1.converteC1;

/**
 *
 * @author a06164358
 */
public class principal {
    
    public static void main(String[] args) {
        int a[] = {0, 0, 1, 0};
        int b[] = {0, 0, 1, 0};
        int d[] = {0, 0, 1, 0};
        int c;
        c = soma(a, b);
        String e;
        converteC1(d);
        
        e = java.util.Arrays.toString(d);
        
        System.out.println(c + " = " + conversaoBinario(c));
        System.out.println("-" + c + " = " + e);
    }
    
}
