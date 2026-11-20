public class Bug extends Tarefa {
    private boolean critico;

    public Bug(int id, String titulo, int complexidade, boolean concluida, boolean critico) {
        super(id, titulo, complexidade, concluida);
        this.critico = critico;
    }

    public boolean isCritico() {
        return critico;
    }

    @Override
    public String getTipo() {
        return "Bug";
    }

    @Override
    public double calcularHorasEstimadas() {
        double horas = getComplexidade() * 2;
        if (critico) {
            horas += 4;
        }
        return horas;
    }
}
