
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo && maer
 */
public class prototipoC1 {

    public static int result[] = new int[4];  // INICIALIZA A VARIAVEL INTEIRA GLOBAL RESULT
    public static String binario, resultado = "", operador = ""; // INICALIZA AS VARIAVEIS GLOBAIS BINARIO E RESULTADO, 
    public static int num1, num2; //NUMERO 1 E 2

    public static void entrada() {

        binario = JOptionPane.showInputDialog(null, "Qual é a equação?", "CALCULADORA BINARIA", JOptionPane.PLAIN_MESSAGE); // ARMAZENA O BINARIO EM UMA STRING

    }
// ---------------------------BASICA-----------------------------------------------------------------------------------------------------------------------------------------

    public static void basica() {
        int a[] = new int[4];
        int b[] = new int[4];
        String[] bin;
        operador = Character.toString(binario.charAt(4)); // IDENTIFICA O SINAL DE OPERAÇÃO NA POSIÇÃO 4
        if (operador.equals("-")) { // VERIFICA SE O OPERADOR É SUBTRAÇÃO.
            bin = binario.split("-");  // USA O SPLIT PARA SEPARAR OS DOIS BINARIOS EM STRINGS
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING A      
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING B                  
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]);// PASSA A STRING PARA INT

            }
            resultado = subtrair(a, b, 0); // EXECUTA O PROCEDIMENTO DE SUBTRAÇÃO.

        } else {
            bin = binario.split("\\+");  // VERIFICA SE O OPERADOR É SOMA
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]); // PASSA O STRING PARA INT 

            }
            resultado = somar(a, b, 0); // EXECUTA O PROCEDIMENTO DE SOMA
        }

    }

    public static String somar(int a[], int b[], int tipo) {
        String resultado = "";
        for (int i = 3; i >= 0; i--) {

            if (a[i] == 0 && b[i] == 0) {
                result[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 0) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                result[i] = 0;
                if (i != tipo) { //Testa se está na ultima casa
                    for (int j = i - 1; j >= 0; j--) { //se não estiver roda todas as outras casas até encontrar um 0
                        if (a[j] == 0) { //se achar só troca pra 1 e sai do if
                            a[j] = 1;
                            break;
                        } else {
                            a[j] = 0; //se não achar vai trocando pra 0
                        }
                    }
                }
            }

        }
        for (int i = 0; i <= 3; i++) {
            resultado += result[i]; // SALVA O RESULTADO EM UMA STRING PARA SER EXIBIDA EM UM JOPTION PANE

        }
        return resultado;
    }

    public static String subtrair(int a[], int b[], int tipo) {
        int resto;
        String resultado = "";
        for (int i = 3; i >= 0; i--) {

            if (a[i] == 0 && b[i] == 0) {
                result[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                result[i] = 1;
                if (i != tipo) { //Testa se está na ultima casa
                    for (int j = i - 1; j >= 0; j--) { //se não estiver roda todas as outras casas até encontrar 1
                        if (a[j] == 1) { //se achar só troca pra 0 e sai do if
                            a[j] = 0;
                            break;
                        } else {
                            a[j] = 0; //se não achar vai trocando pra 0
                        }
                    }
                }
            } else if (a[i] == 1 && b[i] == 0) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                result[i] = 0;

            }

        }
        for (int i = 0; i <= 3; i++) {
            resultado += result[i];

        }
        return resultado;
    }
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

// ---------------------------SINAL MAGNITUDE-----------------------------------------------------------------------------------------------------------------------------------------
    public static void sinalmag() {

    }
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// ---------------------------Complemento de 1-----------------------------------------------------------------------------------------------------------------------------------------    
    public static String somarC1(int a[], int tipo) {
        int b[] = {0, 0, 0, 1};
        String resultado = "";
        for (int i = 3; i >= 0; i--) {

            if (a[i] == 0 && b[i] == 0) {
                result[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 0) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                result[i] = 0;
                if (i != tipo) { //Testa se está na ultima casa
                    for (int j = i - 1; j >= 0; j--) { //se não estiver roda todas as outras casas até encontrar um 0
                        if (a[j] == 0) { //se achar só troca pra 1 e sai do if
                            a[j] = 1;
                            break;
                        } else {
                            a[j] = 0; //se não achar vai trocando pra 0
                        }
                    }
                }
            }

        }
        for (int i = 0; i <= 3; i++) {
            resultado += result[i]; // SALVA O RESULTADO EM UMA STRING PARA SER EXIBIDA EM UM JOPTION PANE

        }
        return resultado;
    }

    public static int[] converter(int a[]) {
        int convertido[] = new int[4];
        for (int i = 0; i < 4; i++) {
            if (a[i] == 0) {
                convertido[i] = 1;
            } else if (a[i] == 1) {
                convertido[i] = 0;
            }
            System.out.print(convertido[i]);
        }

        return convertido;
    }

    public static void complementoDe1() {
        int a[] = new int[4];
        int b[] = new int[4];
        int c[] = {0, 0, 0, 1}; // DECLARA A VARIAVEL RESTO 1
        String[] bin;
        operador = Character.toString(binario.charAt(4)); // IDENTIFICA O SINAL DE OPERAÇÃO NA POSIÇÃO 4
        if (operador.equals("-")) { // VERIFICA SE O OPERADOR É SUBTRAÇÃO.
            bin = binario.split("-");  // USA O SPLIT PARA SEPARAR OS DOIS BINARIOS EM STRINGS
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING A      
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING B
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]);// PASSA A STRING PARA INT

            }
            b = converter(b); // EXECUTA O PROCEDIMENTO DE CONVERSÃO.

            somar(a, b, 0); // EFETUA A SOMA NORMAL
            resultado = somar(result, c, 0); // EFETUA O RESULTADO DA SOMA ACIMA COM 1 

        } else {
            bin = binario.split("\\+");  // VERIFICA SE O OPERADOR É SOMA
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]); // PASSA O STRING PARA INT 

            }
            resultado = somar(a, b, 0); // EXECUTA O PROCEDIMENTO DE SOMA
        }

    }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ---------------------------Complemento de 2-----------------------------------------------------------------------------------------------------------------------------------------    

    public static void complementoDe2(){
    
        int a[] = new int[4];
        int b[] = new int[4];
        int c[] = {0, 0, 0, 1}; // DECLARA A VARIAVEL RESTO 1
        String[] bin;
        operador = Character.toString(binario.charAt(4)); // IDENTIFICA O SINAL DE OPERAÇÃO NA POSIÇÃO 4
        if (operador.equals("-")) { // VERIFICA SE O OPERADOR É SUBTRAÇÃO.
            bin = binario.split("-");  // USA O SPLIT PARA SEPARAR OS DOIS BINARIOS EM STRINGS
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING A      
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING B
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]);// PASSA A STRING PARA INT

            }
            b = converter(b); // EXECUTA O PROCEDIMENTO DE CONVERSÃO.
            
            somar(a, b, 0); // EFETUA A SOMA NORMAL
            somar(result, c, 0);//ADCIONA UM PARA TRANSFORMAR EM COMPLEMENTO DE 2
            resultado = somar(result, c, 0); // SOMA O RESTO
            
            } else {
            bin = binario.split("\\+");  // VERIFICA SE O OPERADOR É SOMA
            String aBin[] = bin[0].split(""); // SETA O PRIMEIRO BINARIO NA STRING
            String bBin[] = bin[1].split(""); // SETA O SEGUNDO BINARIO NA STRING
            num1 = Integer.parseInt(bin[0], 2);
            num2 = Integer.parseInt(bin[1], 2);
            for (int i = 3; i >= 0; i--) {
                a[i] = Integer.parseInt(aBin[i]); // PASSA O STRING PARA INT 
                b[i] = Integer.parseInt(bBin[i]); // PASSA O STRING PARA INT 

            }
            
            somar(a, b, 0); // EXECUTA O PROCEDIMENTO DE SOMA
            resultado = somar(result, c, 0); //TRANSFORMA O RESULTADO DE COMPLEMENTO DE 1 PARA O DE 2
        }
            
        
}
    
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// ----------------MENU------------------------------------------------------------------------------------------------------------------------------------------------
    public static void menu() {
        int opcoes = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Metódo irá utilizar?\n 1-Básica\n 2-Sinal Magnitude\n 3-Complemento de 1\n 4-Complemento de 2", "CALCULADORA BINÁRIA", JOptionPane.PLAIN_MESSAGE));
        if (opcoes == 1) {
            entrada();
            basica();
         //   JOptionPane.showMessageDialog(null, "O resultado da equação " + binario + "\n é " + resultado, "CALCULADORA BINARIA", JOptionPane.PLAIN_MESSAGE, null);
        } else if (opcoes == 3) {
            entrada();
            complementoDe1();
          
           // JOptionPane.showMessageDialog(null, "O resultado da equação " + binario + "(" + num1 + operador + num2 + ")" + "\n é " + resultado + "(" + inteiro + ")", "CALCULADORA BINARIA", JOptionPane.PLAIN_MESSAGE, null);
        } else if (opcoes == 4) {
            entrada();
            complementoDe2();
          
           // JOptionPane.showMessageDialog(null, "O resultado da equação " + binario + "(" + num1 + operador + num2 + ")" + "\n é " + resultado + "(" + inteiro + ")", "CALCULADORA BINARIA", JOptionPane.PLAIN_MESSAGE, null);
        }

    }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

            menu();
          int inteiro = Integer.parseInt(resultado, 2);
          JOptionPane.showMessageDialog(null, "O resultado da equação " + binario + "(" + num1 + operador + num2 + ")" + "\n é " + resultado + "(" + inteiro + ")", "CALCULADORA BINARIA", JOptionPane.PLAIN_MESSAGE, null);
    }

}