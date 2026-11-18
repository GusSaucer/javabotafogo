package ex5;

public abstract class Pessoa {
    private String nome, cpf;

    public Pessoa(String nome, String cpf) {
        if (!setCpf(cpf)) {
         throw new IllegalArgumentException("ERRO");}
         this.nome = nome;
    }           
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    abstract void exibirDadosResumidos();

public boolean setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
            return true;
        } else {
            System.out.println("CPF inválido!");
            return false;
}         }}



