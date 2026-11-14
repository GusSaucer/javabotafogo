package ex3;

public abstract class Veiculo {
    protected String modelo;
    protected int velocidadeAtual;

    public Veiculo(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    abstract void acelerar();
    void frear() {
        if (velocidadeAtual >= 20) {
            velocidadeAtual -= 20;
        } else {
            velocidadeAtual = 0;
        }
    }
    void exibirStatus(){
        System.out.println( modelo + ": " + velocidadeAtual + " Km/h");
    }

}
