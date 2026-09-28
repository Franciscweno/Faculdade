class Main {
    public void main(String[] args){
        Aluno a1 = new Aluno("Ana", 16, 9);
        String Resultado = a1.situacao();
        System.out.println(Resultado);
    }
}

class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String classificarIdade(){
        if (idade < 18){
            return "Menor de idade";
        } else if(idade < 60){
            return "Adulto";
        } else{
            return "Idoso";
        }
    }
    public void apresentar(){
        System.out.println(nome + ", " + idade + " anos - " + classificarIdade());
    }

}

class Aluno extends Pessoa{
    private double nota;
    public Aluno(String nome, int idade, double nota){
        super(nome, idade);
        this.nota = nota;
    }
    public String situacao(){
        if(nota > 7){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
