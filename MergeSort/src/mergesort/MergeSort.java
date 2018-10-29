
package mergesort;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MergeSort {
    
    static void mergeSort(int[] vetor, int[] aux, int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim)/2;
            mergeSort(vetor, aux, 0, meio);
            mergeSort(vetor, aux, meio+1, fim);
            intercalar(vetor, aux, inicio, meio, fim);
        }
    }
    
    static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim){
        for (int x = inicio; x <= fim; x++)
            aux[x] = vetor[x];
        
        int i = inicio;
        int j = meio + 1;
        
        for (int x = inicio; x <= fim; x++){
            if (i > meio){
                vetor[x] = aux[j++];
            }else if (j > fim){
                vetor[x] = aux[i++];
            }else if (aux[i] < aux[j]){
                vetor[x] = aux[i++];
            }else vetor[x] = aux[j++];
        }
        
    }
    
    public static void main(String[] args) {
       int vetor[] = {38,27,43,3,9,82,10};
       int aux[] = new int[vetor.length];
       
       JOptionPane.showMessageDialog(null, "Ordenação de Vetor com Merge Sort: ");
              
       mergeSort(vetor, aux, 0, vetor.length-1);
       
       JOptionPane.showMessageDialog(null, "O vetor ordenado é: " + Arrays.toString(vetor));
    }
    
}
