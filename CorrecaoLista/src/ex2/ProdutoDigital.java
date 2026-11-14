package ex2;

public class ProdutoDigital extends Produto{
    private double tamanhoArquivoMb;

    public ProdutoDigital(String nome, double preco, double tamanhoArquivoMb) {
        super(nome, preco);
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }
    public double calcularFrete(){
        return 0;
    }
}
