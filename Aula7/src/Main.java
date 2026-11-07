public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Gustavo", 123, 500.00);

        minhaConta.depositar( -2000.00);
        minhaConta.exibirExtrato();
    }
}