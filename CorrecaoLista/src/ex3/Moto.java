package ex3;

public class Moto extends Veiculo{
    public Moto(String modelo) {
        super(modelo);
    }
    @Override
    void acelerar() {
        velocidadeAtual += 15;
        System.out.println("DUM DUM");
        if (velocidadeAtual>100){
            velocidadeAtual = 100;
        }}}
