public class Rodar {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
