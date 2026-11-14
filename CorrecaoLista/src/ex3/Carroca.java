package ex3;

public class Carroca extends Veiculo{
    public Carroca(String modelo) {
        super(modelo);
    }
    @Override
    void acelerar() {
        velocidadeAtual += 2;
        System.out.println("TOC TOC TOC TOC");
        if (velocidadeAtual>20){
            velocidadeAtual = 20;
        }}}
