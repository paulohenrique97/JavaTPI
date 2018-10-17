/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provai;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class ProvaI {

    static int leInt;
    static String leStr;

    static void LeituraInt(String texto) {

        leInt = Integer.parseInt(JOptionPane.showInputDialog(null, texto));

    }

    static void LeituraStr(String texto) {

        leStr = JOptionPane.showInputDialog(null, texto);

    }

    static int Preco(int codigo, int peso) {

        int resultado = 0;

        if (codigo >= 1 && codigo <= 4) {

            resultado = 10 * peso;

        } else if (codigo >= 5 && codigo <= 7) {

            resultado = 25 * peso;

        } else if (codigo >= 8 && codigo <= 10) {

            resultado = 35 * peso;

        } else {
            JOptionPane.showMessageDialog(null, "Código do produto inválido!");
        }

        return resultado;

    }

    static double Imposto(double preco, String codPais) {

        double resultado = 0;

        if (codPais.equals("b") | codPais.equals("B")) {

            resultado = preco * 0.15;

        } else if (codPais.equals("c") | codPais.equals("C")) {

            resultado = preco * 0.25;

        } else if (!codPais.equals("a") && !codPais.equals("A")) {

            JOptionPane.showMessageDialog(null, "Código do páis inválido.");

        }

        return resultado;

    }

    static double PrecoFinal(double preco, double imposto) {

        double resultado;

        resultado = preco + imposto;

        return resultado;

    }

    public static void main(String[] args) {

        int codigo, peso;
        String codPais;
        double preco, imposto, precoFinal;

        LeituraInt("Insira o código do produto: (1 à 10)");
        codigo = leInt;

        LeituraInt("Insira o peso do produto em gramas: ");
        peso = leInt;

        LeituraStr("Insira o código do País do produto: (A, B ou C)");
        codPais = leStr;

        preco = Preco(codigo, peso);
        imposto = Imposto(preco, codPais);
        precoFinal = PrecoFinal(preco, imposto);

        String resultado = "Preco sem imposto: " + preco + "\nImposto: " + imposto + "\nPreço final: " + precoFinal;

        JOptionPane.showMessageDialog(null, resultado);

    }

}
