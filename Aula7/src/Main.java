public class Main {
    public static void main(String[] args) {
//        ContaBancaria minhaConta = new ContaBancaria("Gustavo", 123, 500.00);
//
//        minhaConta.depositar( -2000.00);
//        minhaConta.exibirExtrato();

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Ana", 1300.00);
        funcionarios[1] = new Funcionario("Maria" , 5000.00);
        funcionarios[2] = new Funcionario("José", 2200.00);

        for(int i=0; i<3; i++){
            funcionarios[i].exibirHolerite();
        }
    }
}