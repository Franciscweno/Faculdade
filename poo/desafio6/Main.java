class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " faz som");
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz au au - Raça: " + raca);
    }
}

class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz miau");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal[] animais = {
            new Cachorro("Rex", "Vira-Lata"),
            new Gato("Perola")
        };

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}

