package ex4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente ana = new ContaCorrente("Ana", 1, 1000);

        ContaCorrente bruno = new ContaCorrente("Bruno", 2, 2000);
        bruno.depositar(800);
        bruno.sacar(300);

        ContaPoupanca carla = new ContaPoupanca("Carla", 3, 5000);
        carla.sacar(9000); // deve ser negado

        AuditoriaInterna auditoria = new AuditoriaInterna();
        auditoria.registrar(ana);
        auditoria.registrar(bruno);
        auditoria.registrar(carla);
        auditoria.exibirTotal();
    }
}