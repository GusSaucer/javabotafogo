package ex3;

public class Carro extends Veiculo{
    public Carro(String modelo) {
        super(modelo);
    }
    @Override
    void acelerar() {
        velocidadeAtual += 10;
        System.out.println("VRUM VRUM");
        if (velocidadeAtual>120){
            velocidadeAtual = 120;
        }}}
