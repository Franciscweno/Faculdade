interface Reembolso{
    double calcularReembolso();


}


abstract class Pessoa{
    public String nome;    
    public Pessoa(String nome){
        this.nome = nome;

    }
    
}

class Funcionario extends Pessoa implements Reembolso{
    private String departamento;
    private double Salario;
    private Contrato contrato;


    public Funcionario(String nome, String departamento, double Salario){
        super(nome);
        this.departamento = departamento;
        this.Salario = Salario;


    }

    public void adicionarContrato(String Equipamento, double valorEquipamento, boolean podeReembolsar, String tipoContrato){
        contrato = new Contrato(Equipamento, valorEquipamento, podeReembolsar, tipoContrato);
    }

    @Override 
    public double calcularReembolso(){
        if(contrato.podeReembolsar == false){
            return contrato.valorEquipamento;
        }

        else if(contrato.valorEquipamento < 100){
            return contrato.valorEquipamento - (contrato.valorEquipamento * 0.2);
            
        }
        
        else if(contrato.valorEquipamento < 500){
            return contrato.valorEquipamento - (contrato.valorEquipamento * 0.5);
             
        }
        else if(contrato.valorEquipamento < 1000){
            return contrato.valorEquipamento - (contrato.valorEquipamento * 0.6);
            
        }
        
        else{
            return contrato.valorEquipamento - (contrato.valorEquipamento * 1.5);

        }
    }

    public void mostrarFuncionario(){
        System.out.println("\n------------Informações do Funcioário------------\n");
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Departamento do Funcionário: " + departamento);
        System.out.println("Salario do Funcionário: " + Salario);
        System.out.println("\n------------Informações do Contrato------------\n");
        System.out.println("Tipo de contrato: " + contrato.tipoContrato);
        System.out.println("Equipamento: " + contrato.Equipamento + " | " + "Valor: R$" + contrato.valorEquipamento);
        System.out.println("Desconto/Reembolso do equipamento " + calcularReembolso());


    }
}


class Contrato{
    public String Equipamento;
    public double valorEquipamento;
    public boolean podeReembolsar;
    public String tipoContrato;

    public Contrato(String Equipamento, double valorEquipamento, boolean podeReembolsar, String tipoContrato){
        this.Equipamento = Equipamento;
        this.valorEquipamento = valorEquipamento;
        this.podeReembolsar = podeReembolsar;
        this.tipoContrato = tipoContrato;
        
    }

}
    




public class Main{
    public static void main(String args[]){
        Funcionario f1 = new Funcionario("Igo", "Almoxarifado", 5000.00);
        f1.adicionarContrato("computador", 1500, true, "Locação");
        f1.calcularReembolso();
        f1.mostrarFuncionario();




    }
}
