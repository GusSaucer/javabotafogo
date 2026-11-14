package ex2;

public class ProdutoFisico extends Produto{
    private double pesoKg;

    public ProdutoFisico(String nome, double preco, double pesoKg) {
        super(nome, preco);
        this.pesoKg = pesoKg;
    }
    public double calcularFrete(){
        return 10.00 + 5*this.pesoKg;
    }
}
