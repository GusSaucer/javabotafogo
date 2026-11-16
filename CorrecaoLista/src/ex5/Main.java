package ex5;
import ex2.Produto;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        while (true){
            System.out.println("Digite uma opção:\n(A)luno\n(P)rofessor\n(FIM) para finalizar");
            String opcao = leitor.nextLine();
            if (opcao.equals("A")){
                System.out.println("Digite seu nome:\n");
                String nome = leitor.nextLine();
                System.out.println("Digite seu CPF:\n");
                String cpf = leitor.nextLine();
                while (cpf.length() != 11) {
                    System.out.println("CPF inválido, Digite novamente:\n");
                    cpf = leitor.nextLine();
                }
                System.out.println("Digite sua nota 1:");
                double nota1 = leitor.nextDouble();
                while (nota1 <0 || nota1>10){
                    System.out.println("Digite uma nota válida:");
                    nota1 = leitor.nextDouble();
                }
                System.out.println("Digite sua nota 2:");
                double nota2 = leitor.nextDouble();
                while (nota2 <0 || nota2>10){
                    System.out.println("Digite uma nota válida:");
                    nota2 = leitor.nextDouble();
                }

                pessoas.add(new Aluno(nome, cpf, nota1, nota2));
                } else if(opcao.equals("P")){
            System.out.println("Digite seu nome:\n");
            String nome = leitor.nextLine();
            System.out.println("Digite seu CPF:\n");
            String cpf = leitor.nextLine();
            while (cpf.length() != 11) {
                System.out.println("CPF inválido, Digite novamente:\n");
                cpf = leitor.nextLine();
            }
                System.out.println("Digite o valor da hora/aula:");
                double horaAula = leitor.nextDouble();
                System.out.println("Digite quantas horas o professor deu:");
                double quantidadeAulas = leitor.nextDouble();

                pessoas.add(new Professor(nome, cpf, horaAula, quantidadeAulas));
            }else if(opcao.equals("FIM")){
                for (Pessoa p : pessoas) {
                    p.exibirDadosResumidos();
                }
                break;
            }else{
                System.out.println("Tipo inválido: " + opcao + " não reconhecido");
            }
        }
    }
}