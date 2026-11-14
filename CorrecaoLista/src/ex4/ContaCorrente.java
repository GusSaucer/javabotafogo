package ex4;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    double calcularTributos() {
        return getSaldo() * 0.01;
    }
}