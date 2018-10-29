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
public class funcoes {

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

    public static int conversaoDecimal(int binario[]) {
        int decimal = 0;
        for (int i = 0; i < 4; i++) {
            if (binario[i] != 0) {
                decimal += (binario[i] * (potencia(2, i)));
            }
        }
        return decimal;
    }
    
    public static String conversaoBinario(int decimal){
        String binario = "";
        while (decimal > 0){
            if(decimal % 2 == 0){
                binario += "0";
            } else binario += "1";
            decimal /= 2;
        }
        return binario;
    }

    public static void main(String[] args) {
        int a[] = {0, 0, 0, 1};
        System.out.println(conversaoDecimal(a));
        System.out.println(conversaoBinario(conversaoDecimal(a)));
    }

}
