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
    boolean depositar(double valor){
        if(valor>0) {
            // this.saldo = this.saldo + valor;
            this.saldo += valor;
            return true;
        }else{
            return false;
        }
    }

    boolean sacar(double valor){
        if (valor<= this.saldo) {
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    void exibirExtrato(){
        System.out.println("Número da conta: " + this.numero
                + "\nTitular: "+ this.titular
                + "\nSeu saldo atual é de R$"
                + this.saldo);


    }
}
