package recursividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class RecursividadeExercicios5 {

    public static void imprimeVetor(int vetor[], int i, String resultado){ //parametros são o vetor e sua maior casa
        if (i == 0) {
            resultado += (vetor[i]); //quando o i chegar a 0 só imprime
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            resultado += (vetor[i] + " "); //se não for 0, imprime, tira 1 do i e chama a função de novo, com o i menor
            i--;
            imprimeVetor(vetor, i, resultado);
        }
    }
    
    static void leitura(int x[]) { //leitura
        for (int i = 0; i < x.length; i++) { 
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição " + (i + 1) + " : "));
        }
    }
    
    public static void main(String[] args) {
        int a[] = new int[5];
        leitura(a);
        imprimeVetor(a, a.length-1, ""); //a.length-1 é o tamanho do vetor - 1, então, se um vetor for de 5, ele passa 4, já que as casas vão de 0 a 4 
    }
    
}
