import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:\n");
        int tentativas = 0;
        while(tentativas <= 5){
        try{
        int numero = leitor.nextInt();
            System.out.println(tentativas);
        break;
        }catch(InputMismatchException e){
            System.out.println("Digite Apenas números");
            leitor.nextLine();
        }finally {
            tentativas += 1;
            if (tentativas==6){
                throw new IllegalArgumentException("Você excedeu o máximo de tentativas e seu acesso foi bloqueado");
            }
            System.out.println("Fim da tentativa");
        }
        }
    }
}