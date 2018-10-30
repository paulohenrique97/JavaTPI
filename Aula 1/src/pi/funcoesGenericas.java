/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

/**
 *
 * @author Paulo
 */
public class funcoesGenericas {
    
    public static int potencia(int base, int expoente) {
        int resultado = 1;
        if (expoente != 0) {
            resultado = base;
            for (int i = 0; i < expoente - 1; i++) {
                resultado *= base;
            }
        }
        return resultado;
    }
    
}
