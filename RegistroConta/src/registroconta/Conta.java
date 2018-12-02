package registroconta;

import javax.swing.JOptionPane;

public class Conta {
    
    private int numConta;
    private String nomeProprietario;
    private double saldo;
    private boolean status;
    private String tipo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void AbrirConta(double saldo, String tipo){
        
        boolean statusConta = isStatus();
        if(!statusConta){
            setSaldo(saldo);
            setTipo(tipo);
            setStatus(true);
        }
    }
    
    public void Deposito(double deposito){
        
        boolean statusConta = isStatus();
        if(statusConta){
            double saldoConta = getSaldo();
            setSaldo(saldoConta+deposito);
        } else JOptionPane.showMessageDialog(null, "ERRO: Conta Fechada.");
    }
    
    public void Saque(double saque){
        
        boolean statusConta = isStatus();
        if(statusConta){    
            double saldoConta = getSaldo();
            setSaldo(saldoConta-saque);
        } else JOptionPane.showMessageDialog(null, "ERRO: Conta Fechada.");
    }
    
    public void PagarMensalidade(){
        
        boolean statusConta = isStatus();
        if(statusConta){
            String tipoConta = getTipo();
            double saldoConta = getSaldo();
            if(tipoConta.equals("CC")){
                setSaldo(saldoConta-15);
            } else setSaldo(saldoConta-5);
        } else JOptionPane.showMessageDialog(null, "ERRO: Conta fechada.");
        
    }
    
    public void FecharConta(){
        
        boolean statusConta = isStatus();
        if(statusConta){
            double saldoConta = getSaldo();
            if(saldoConta==0){
                setStatus(false);
            } else JOptionPane.showMessageDialog(null, "ERRO: Saldo não é igual à 0.");
        } else JOptionPane.showMessageDialog(null, "ERRO: Conta já está fechada.");
    }
    
    public void InformacoesGerais(){
        
        String informacoes;
        boolean statusConta = isStatus();
        informacoes = "Número da Conta: " + getNumConta() + "\n";
        informacoes += "Nome do Proprietário " + getNomeProprietario() + "\n";
        informacoes += "Saldo da Conta: " + getSaldo() + "\n";
        if(statusConta){
           informacoes += "Status da Conta: Aberta \n"; 
        } else informacoes += "Status da Conta: Fechada \n";
        informacoes += "Tipo da Conta: " + getTipo(); 
        
        JOptionPane.showMessageDialog(null, informacoes);
        
    }
    
}
