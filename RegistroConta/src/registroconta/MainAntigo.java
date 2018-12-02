package registroconta;

public class MainAntigo {

    public static void main(String[] args) {
    
        Conta c1 = new Conta();
        c1.setNumConta(1234);
        c1.AbrirConta(10, "CC");
        c1.setNomeProprietario("Ezequiel");
        c1.Deposito(100);
        c1.Saque(50);
        c1.PagarMensalidade();
        //c1.FecharConta();
        c1.InformacoesGerais();
        
    }
    
}
