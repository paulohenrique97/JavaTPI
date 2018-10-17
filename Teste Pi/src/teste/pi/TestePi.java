/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.pi;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class TestePi {

    public static int vetor[] = new int[4];
    public static int vetor2[] = new int[4];
    public static int soma[] = new int[4];
    public static int subt[] = new int[4];
    public static String binario;
    public static String[] bin;
    public static int resto;

    public static void entrada(int vetors[]) {

        binario = JOptionPane.showInputDialog("Qual é o numero binario?"); // ARMAZENA O BINARIO EM UMA STRING
        converter(vetors);
    }

    public static void converter(int vetor[]) {
        bin = binario.split("");  // USA O SPLIT PARA SEPARAR A STRING

        for (int i = 3; i >=0 ; i--) {
            vetor[i] = Integer.parseInt(bin[i]); // PASSA O STRING PARA INT USANDO O FOR
            //   System.out.println(vetor[i]); // IMPRIME NA TELA O BINARIO SEPARADO EM CADA VETOR
        }

    }

    public static void somar(int a[], int b[], int tipo) { //tipo = 1 pra sinal magnitude e 0 pra soma normal
                
        for (int i = 3; i >=tipo; i--) {

            if (a[i] == 0 && b[i] == 0 ) {
                soma[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                soma[i] = 1;
            } else if (a[i] == 1 && b[i] == 0) {
                soma[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                soma[i] = 0;
                if (i!= tipo){ //Testa se está na ultima casa
                    for (int j = i-1; j >= tipo; j--){ //se não estiver roda todas as outras casas até encontrar um 0
                        if (a[j] == 0){ //se achar só troca pra 1 e sai do if
                            a[j] = 1;
                            break; 
                        } else a[j]=0; //se não achar vai trocando pra 0
                    }
                } else resto=1; //se estiver na ultima casa no if lá encima, só salva o resto
            }

        }
        
    }
    
    public static void subtracao(int a[], int b[]) { //tipo = 1 pra sinal magnitude e 0 pra soma normal
                
        for (int i = 3; i >=0; i--) {

            if (a[i] == 0 && b[i] == 0 ) {
                subt[i] = 0;
            } else if (a[i] == 1 && b[i] == 0) {
                subt[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                subt[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                subt[i] = 1;
                if (i != 0) {
                    for (int j = i-1; j >= 0; j--){
                        if (a[j] == 1){ 
                            a[j] = 0;
                            break; 
                        } else a[j] = 0;
                    }
                }    
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        entrada(vetor);
        entrada(vetor2);
        //somar(vetor, vetor2, 0);
        subtracao(vetor, vetor2);
        //System.out.println("");
        //for (int i = 0; i <= 3; i++) {
        //    System.out.print(soma[i]);
            
        //}
        System.out.println("");
        for (int i = 0; i <= 3; i++) {
            System.out.print(subt[i]);
            
        }
        
    }
    
}
