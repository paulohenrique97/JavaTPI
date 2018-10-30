/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import static pi.funcoesGenericas.potencia;
import static pi.operacoes.soma;

/**
 *
 * @author Paulo
 */
public class conversao {

    

    public static int conversaoDecimal(int binario[]) {
        int decimal = 0;
        for (int i = 0; i < 4; i++) {
            if (binario[i] != 0) {
                decimal += (binario[i] * (potencia(2, i)));
            }
        }
        return decimal;
    }

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

    public static void main(String[] args) {
        int a[] = {0, 0, 1, 0};
        int b[] = {0, 0, 1, 0};
        int c;
        c = soma(a, b);
        System.out.println(c + " = " + conversaoBinario(c));
    }

}
