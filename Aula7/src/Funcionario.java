public class Funcionario {
    private String nome;
    private double salarioBruto;
    Funcionario(String nome, double salarioBruto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    double calcularInss() {
        double inss;
        if (this.salarioBruto >= 2000.00) {
            inss = 0.11;
        } else if (this.salarioBruto >= 1500.00) {
            inss = 0.09;
        } else {
            inss = 0.08;
        }
        return this.salarioBruto*inss;
    }
    double calcularValeTransporte() {
        double vt;
        if (this.salarioBruto >= 1000.00){
            vt = 0.06;
        } else{
            vt = 0.05;
        }
        return this.salarioBruto*vt;
    }

    double calcularSalarioLiquido(){
        return this.salarioBruto-this.calcularInss()-this.calcularValeTransporte();
    }

    void exibirHolerite(){ //Holerite == Contra-cheque
        System.out.println("Nome do funcionário: " + this.nome
                + "\nSalário bruto: " + this.salarioBruto
                + "\nDesconto INSS: " + this.calcularInss()
                + "\nDesconto VT: " + this.calcularValeTransporte()
                + "\nSalário Líquido: " + this.calcularSalarioLiquido() + "\n\n");
    }
}






