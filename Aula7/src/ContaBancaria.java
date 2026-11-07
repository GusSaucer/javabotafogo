public class ContaBancaria {
    String titular;
    int numero;
    double saldo;
    ContaBancaria(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    ContaBancaria(String titular,int numero, double depositoInicial ){
        this(titular, numero);
        this.saldo = depositoInicial;
    }

}
