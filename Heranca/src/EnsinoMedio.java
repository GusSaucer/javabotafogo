public class EnsinoMedio extends Aluno{
    private String espec;

    EnsinoMedio(String nome, String espec){
        this.nome= nome;
        this.espec=espec;
    }
    public void mostrarAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        // Correção: Chamando o método verificarSituacao() para exibir o status atualizado
        System.out.println("Status: " + verificarSituacao());
        System.out.println("Especificação: " + espec);
    }
}
