// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Docente gustavo = new Docente(50,160);
        Secretaria patricia = new Secretaria();

        System.out.println(gustavo.calcularSalarioLiquido());
        System.out.println(patricia.calcularSalarioLiquido());
    }
}