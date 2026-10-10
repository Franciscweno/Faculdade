public class Main{
    public static void main(String[] args){
        Pagamento p1 = new Pix("Carlos");
        p1.Pagar(10.00);

        FormaPagamento f1 = new Pix("Carlos");
        f1.Titular();
    }
}

interface Pagamento{
    void Pagar(Double valor);
}

abstract class FormaPagamento{
    String nome;
    FormaPagamento(String nome){
        this.nome = nome;
        
    }

    abstract void Titular();

}

class Pix extends FormaPagamento implements Pagamento{
    Pix(String nome){
        super(nome);
        }

    @Override 
    void Titular(){
        System.out.println("Titular: " + nome);
    }

    @Override 
    public void Pagar(Double valor){
        System.out.println("Valor pago: " + valor);
    }
}