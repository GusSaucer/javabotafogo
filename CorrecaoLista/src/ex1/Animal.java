package ex1;

public class Animal {
    private String nome;
    Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String emitirSom(){
        return "...";
    }
    public String apresentar(){
        return getNome() + " faz " + emitirSom();
    }
}

