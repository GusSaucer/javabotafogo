package ex4;

public class AuditoriaInterna {
    private double totalTributos;

    public void registrar(ContaBancaria conta) {
        System.out.printf("%s: R$ %.2f%n", conta.getTitular(), conta.calcularTributos());
        totalTributos += conta.calcularTributos();;
    }

    public void exibirTotal() {
        System.out.printf("Total de tributos: R$ %.2f%n", totalTributos);
    }
}