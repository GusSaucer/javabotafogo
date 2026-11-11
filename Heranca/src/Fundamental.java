public class Fundamental extends Aluno{
    Fundamental(String nome){
        this.nome= nome;
    }
    @Override
    public String verificarSituacao() {
        if (this.media >= 5.0) {
            return "Aprovado";
        }
        return "Reprovado";
    }
}
