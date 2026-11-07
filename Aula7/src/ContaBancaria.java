public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
    ContaBancaria(String titular,int numero, double depositoInicial ){
        this(titular, numero);
        this.saldo = depositoInicial;
    }
    String getTitular() {
        return titular;
    }
    int getNumero() {
        return numero;
    }
    double getSaldo() {
        return saldo;
    }
    void depositar(double valor){
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    }
    boolean sacar(double valor){
        if (valor<= this.saldo) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    void exibirExtrato(){
        System.out.println("Seu saldo atual é de R$" + this.saldo);
    }
}
