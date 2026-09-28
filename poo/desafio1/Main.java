public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Peter Pan";
        livro1.setPreco(49.90);
        livro1.exibirDados();
        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Príncipe";
        livro2.setPreco(59.90);
        livro2.exibirDados();
        //chamada do metodo dentro da classe passando o valor do parametro percentual para que o calculo seja feito
        livro1.aplicarDesconto(10);
        livro2.aplicarDesconto(25);
    }

class Livro {
    public String titulo;
    private double preco;

    //metodo para acessar o atributo preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //metodo para pegar o preço na classe main
    public double getPreco() {
        return preco;
    }


    //metodo que aplica o desconto e printa o atributo preço com desconto na tela
    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual/100);

        System.out.println("Livro em promoção: " + titulo 
            + " | Preço com desconto: " + preco);
    }

    //metodo que exibe o atributo preço na tela
    public void exibirDados() {
        System.out.println("Título: " + titulo
             + " / Valor: " + preco);
    }
}