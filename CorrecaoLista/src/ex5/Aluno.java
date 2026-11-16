package ex5;

public class Aluno extends Pessoa{
    private double nota1, nota2;

    public Aluno(String nome, String cpf, double nota1, double nota2) {
        super(nome, cpf);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    String verificarSituacao() {
        double media = calcularMedia();
        if (media < 5) {
            return "Reprovado";
        }
        if (media < 7) {
            return "Recuperação";
        } else {
            return "Aprovado";
        }
    }
    @Override
        void exibirDadosResumidos(){
            System.out.println("Aluno | "
                    + getNome() + " | CPF: "
                    + getCpf() + " | Média: "
                            + calcularMedia() + " | "
                            + verificarSituacao());

        }
    }
