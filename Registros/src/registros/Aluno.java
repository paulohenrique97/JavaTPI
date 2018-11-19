/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registros;

import javax.swing.JOptionPane;

/**
 *
 * @author a06164358
 */
public class Aluno {
    
    private String nome;
    private String ra;
    private char sexo;
    private int idade;
    private double altura;
    
    public void Aluno(){
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Status(){
        String status;
        status = "Nome do aluno: " + getNome() + "\n";
        status += "RA do aluno: " + getRa() + "\n";
        status += "Sexo do aluno: " + getSexo() + "\n";
        status += "Idade do aluno: " + getIdade() + "\n";
        status += "Altura do aluno: " + getAltura() + "\n";
        JOptionPane.showMessageDialog(null, status);
    }
    
}
