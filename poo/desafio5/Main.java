class Main {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Carlos", 3000.00, 1);
        Gerente g1 = new Gerente("Beatriz", 8000.00, 12, 14);
        f1.apresentar();
        g1.apresentar();
        System.out.println("Salário Total da Beatriz: R$ " + g1.salarioTotal());
    }
}

class Funcionario {
    protected String nome;
    protected Double salarioBase;
    protected int anosDeEmpresa;

    public Funcionario(String nome, Double salarioBase, int anosDeEmpresa){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.anosDeEmpresa = anosDeEmpresa;
    }
    public String classificarTempo(){
        if (anosDeEmpresa < 2){
            return "Novato";
        } else if(anosDeEmpresa >= 2 && anosDeEmpresa <= 9){
            return "Experiente";
        } else {
            return "Veterano";
        }
    }
    public void apresentar(){
        System.out.println(this.nome + ", R$: " + this.salarioBase + " - " + this.classificarTempo());
    }

}

class Gerente extends Funcionario{
    private int qtdLiderados;
    public Gerente(String nome, double salarioBase, int anosDeEmpresa, int qtdLiderados){
        super(nome, salarioBase, anosDeEmpresa);
        this.qtdLiderados = qtdLiderados;
    }
    public Double calcularBonus(){
        double bonus = this.qtdLiderados * 200.00;

        if(this.qtdLiderados > 10){
            bonus += 500.00;
        }

        return bonus;
    }

        public double salarioTotal() {
        return this.salarioBase + this.calcularBonus();

    }
}
