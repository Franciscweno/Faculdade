public class Main{
    void main(){
        int total = 100;
        int pessoas = 0;
        try{
            int porPessoa = total/pessoas;
            System.out.println("valor por pessoa: " + porPessoa);
        }catch(ArithmeticException e){
            System.out.println("Erro");
        }

        try{
            Despesa d = new Despesa(-50);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }

    }

}

class Despesa{
    Double valor;
    public Despesa(double valor){
        if (valor<0){
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.valor = valor;
    }
}