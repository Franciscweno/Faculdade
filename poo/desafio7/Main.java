interface FormaPagamento {
    void pagar(double valor);
}

abstract class Pagamento {
    protected String nomeTitular;

    public Pagamento(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}

class Pix extends Pagamento implements FormaPagamento {
    private String chavePix;

    public Pix(String nomeTitular, String chavePix) {
        super(nomeTitular);
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("\n--- Pagamento via PIX ---");
        System.out.println("Chave PIX: " +  chavePix);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Valor pago: R$" + valor);
    }
}

class CartaoCredito extends Pagamento implements FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String nomeTitular, String numeroCartao) {
        super(nomeTitular);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("\n--- Pagamento via Cartão de Crédito ---");
        System.out.println("Cartão: " + numeroCartao);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Valor pago: R$" + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        FormaPagamento pagamento1 = new Pix("Carlos Silva", "carlos@email.com");
        FormaPagamento pagamento2 = new CartaoCredito("Ana Souza", "4111.XXXX.XXXX.1234");

        pagamento1.pagar(25.50);
        pagamento2.pagar(14.00);
    }
}
