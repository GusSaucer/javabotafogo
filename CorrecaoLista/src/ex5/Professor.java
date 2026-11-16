package ex5;

public class Professor extends Pessoa{
    private double quantidadeAulas, valorHoraAula;

    public Professor(String nome, String cpf, double quantidadeAulas, double valorHoraAula) {
        super(nome, cpf);
        this.quantidadeAulas = quantidadeAulas;
        this.valorHoraAula = valorHoraAula;
    }
    double calcularPagamento(){
        return quantidadeAulas*valorHoraAula;
    }

    @Override
    void exibirDadosResumidos(){
        System.out.println("Professor | "
                + getNome() + " | CPF: "
                + getCpf() + " | "
                + quantidadeAulas + " aulas | R$ "
                + calcularPagamento());

    }
}
