public class Feature extends Tarefa {
    private int quantidadeTelas;

    public Feature(int id, String titulo, int complexidade, boolean concluida, int quantidadeTelas) {
        super(id, titulo, complexidade, concluida);
        this.quantidadeTelas = quantidadeTelas;
    }

    public int getQuantidadeTelas() {
        return quantidadeTelas;
    }

    @Override
    public String getTipo() {
        return "Feature";
    }

    @Override
    public double calcularHorasEstimadas() {
        return getComplexidade() * 3 + quantidadeTelas * 2;
    }
}
