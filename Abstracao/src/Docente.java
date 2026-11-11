public class Docente extends Funcionario {
    double horaAula, horasTrabalhadas;
    Docente(double horaAula, double horasTrabalhadas) {
        this.horaAula = horaAula;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioLiquido(){
        return horaAula*horasTrabalhadas;
    }

}
