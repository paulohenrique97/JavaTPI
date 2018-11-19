/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registros;
import javax.swing.JOptionPane;
import registros.Aluno;

/**
 *
 * @author a06164358
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a1 = new Aluno();
        a1.setNome("Paulo Henrique Mendes Vieira");
        a1.setRa("a06164358");
        a1.setSexo('M');
        a1.setIdade(21);
        a1.setAltura(1.85);
        
        a1.Status();
        
    }
    
}
