import java.util.ArrayList;

public class Desenvolvedor {
    private String nome;
    private String cargo;
    private ArrayList<Tarefa> tarefas;

    public Desenvolvedor(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
}
