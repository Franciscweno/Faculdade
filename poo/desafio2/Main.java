public class Main {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();
        c1.saldo = 250;
        c1.depositar(350);
        int valorSaldo = c1.consultarSaldo();
        System.out.println(valorSaldo);
        int valorSaldoBonus = c1.calcularBonus();
        System.out.println(valorSaldoBonus);
    }
}

class ContaBancaria{
    String tirular;
    int saldo;


    void depositar(int valor){
        saldo = saldo + valor;
    }

    int calcularBonus(){
        int bonus = saldo/10;
        int novoSaldo = saldo + bonus;
        System.out.println("O bônus é de: " + bonus + " Reais " + "e o saldo total é de R$: " + novoSaldo);
        return novoSaldo;
    }

    int consultarSaldo(){
        return saldo;
    }
}