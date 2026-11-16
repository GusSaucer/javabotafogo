package ex5;

public abstract class Pessoa {
    private String nome, cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    abstract void exibirDadosResumidos();

    public void setCpf(String cpf) { //CONFERIR
        if (cpf.length() == 11){
        this.cpf = cpf;
    }   }
}



