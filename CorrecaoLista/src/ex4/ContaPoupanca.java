package ex4;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }
    double calcularTributos() {
        return 0;
    }
}
