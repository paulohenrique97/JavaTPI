package recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Implementar1 {
    
    public static void imprimeVetor(int vetor[], int i, String resultado){
        if (i == vetor.length-1) {
            resultado += (vetor[i]);
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            resultado += (vetor[i] + " ");
            i++;
            imprimeVetor(vetor, i, resultado);
        }
    }
    
    static void leitura(int x[]) {
        for (int i = 0; i < x.length; i++) { 
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da posição " + (i + 1) + " : "));
        }
    }
    
    public static void main(String[] args) {
        int a[] = new int[5];
        leitura(a);
        imprimeVetor(a, 0, ""); 
    }
}
