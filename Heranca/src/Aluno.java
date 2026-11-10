public class Aluno {
    protected String nome; // PROTECTED ainda é encapsulamento, mas os filhos conseguem acessar (diferente do private)
    private double prova01;
    private double prova02;
    protected double media;
    private String situacao;
    public double getMedia() {
        return this.media;
    }
    public double calcularMedia() {
        this.media = (prova01 + prova02) / 2;
        return this.media;
    }

    public String verificarSituacao() {
        if (this.media >= 7.0) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        // Correção: Chamando o método verificarSituacao() para exibir o status atualizado
        System.out.println("Status: " + verificarSituacao());
    }

}