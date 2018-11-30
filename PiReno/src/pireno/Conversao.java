/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pireno;

import static pireno.FuncoesGenericas.potencia;

/**
 *
 * @author Paulo
 */
public class Conversao {

    

    public static int conversaoDecimal(int binario[]) {
        int decimal = 0;
        for (int i = 0; i < binario.length; i++) {
            if (binario[i] != 0) {
                decimal += (binario[i] * (potencia(2, i)));
            }
        }
        return decimal;
    }
    
//    public static int conversaoDecimalString(int binVetor[], String binVetorString[]) {
//        for()
//    }

    public static String conversaoBinario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            if (decimal % 2 == 0) {
                binario += "0";
            } else {
                binario += "1";
            }
            decimal /= 2;
        }

        StringBuilder sb = new StringBuilder(binario);
        binario = sb.reverse().toString();

        while (binario.length() < 4) {
            binario = "0" + binario;
        }
        return binario;
    }

    
}
