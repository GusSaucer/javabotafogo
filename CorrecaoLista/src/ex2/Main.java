package ex2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new ProdutoFisico("Notebook", 3000, 2.5));
        produtos.add(new ProdutoDigital("E-book Java", 39.90, 15));
        produtos.add(new Produto("Caneca", 45));
        produtos.add(new ProdutoFisico("Teste", -100, 1));

        for (Produto p : produtos) {
            System.out.println(p.getNome());
            System.out.printf("  Preço: R$ %.2f%n", p.getPreco());
            System.out.printf("  Frete: R$ %.2f%n", p.calcularFrete());
            System.out.printf("  Preço final: R$ %.2f%n", p.calcularPrecoFinal());
        }
    }
}