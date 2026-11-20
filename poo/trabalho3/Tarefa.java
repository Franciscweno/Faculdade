public abstract class Tarefa implements Estimavel {
    private int id;
    private String titulo;
    private int complexidade;
    private boolean concluida;

    public Tarefa(int id, String titulo, int complexidade, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.complexidade = complexidade;
        this.concluida = concluida;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public abstract String getTipo();

    public void exibirResumo() {
        String status = concluida ? "CONCLUÍDA" : "ABERTA";
        System.out.printf("[%s #%d] %s - %.1fh - %s%n",
                getTipo(), id, titulo, calcularHorasEstimadas(), status);
    }
}
