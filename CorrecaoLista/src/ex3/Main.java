package ex3;

public class Main {
    public static void main(String[] args) {
        Carro gol = new Carro("Gol");

        // acelerar 3 vezes: 30 km/h
        for (int i = 0; i < 3; i++) {
            gol.acelerar();
        }
        gol.exibirStatus();

        // frear 1 vez: 10 km/h
        gol.frear();
        gol.exibirStatus();

        // frear mais 1 vez: 0 km/h (não pode ficar -10)
        gol.frear();
        gol.exibirStatus();

        Moto cg = new Moto("CG 160");

        // acelerar 7 vezes: 100 km/h (seriam 105)
        for (int i = 0; i < 7; i++) {
            cg.acelerar();
        }
        cg.exibirStatus();
    }
}