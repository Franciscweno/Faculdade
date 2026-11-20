import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Desenvolvedor> equipe = new ArrayList<>();

        Desenvolvedor ana = new Desenvolvedor("Ana", "Senior");
        ana.adicionarTarefa(new Bug(1, "Login falha com e-mail em maiúsculas", 3, false, true));
        ana.adicionarTarefa(new Feature(2, "Tela de recuperação de senha", 4, false, 2));
        ana.adicionarTarefa(new Bug(3, "Ícone desalinhado no menu", 1, true, false));

        Desenvolvedor bruno = new Desenvolvedor("Bruno", "Pleno");
        bruno.adicionarTarefa(new Feature(4, "Filtro de pedidos por data", 3, false, 1));
        bruno.adicionarTarefa(new Bug(5, "App fecha ao girar a tela", 4, false, true));

        Desenvolvedor carla = new Desenvolvedor("Carla", "Junior");
        carla.adicionarTarefa(new Bug(6, "Texto cortado no botão Salvar", 1, false, false));
        carla.adicionarTarefa(new Bug(7, "Pagamento duplicado no checkout", 5, false, true));
        carla.adicionarTarefa(new Feature(8, "Modo escuro", 2, true, 3));

        // Diego acabou de entrar na squad e ainda não tem tarefas
        Desenvolvedor diego = new Desenvolvedor("Diego", "Pleno");

        equipe.add(ana);
        equipe.add(bruno);
        equipe.add(carla);
        equipe.add(diego);

        System.out.println("1. Total de desenvolvedores: " + contarDesenvolvedores(equipe));
        System.out.println("2. Desenvolvedores Plenos: " + contarPorCargo(equipe, "Pleno"));
        System.out.println("3. Total de tarefas: " + contarTarefas(equipe));

        System.out.println("\n4. Bugs abertos:");
        listarBugsAbertos(equipe);

        System.out.println("\n5. Desenvolvedor mais sobrecarregado: " + devMaisSobrecarregado(equipe));

        System.out.println("\nDesafio bônus:");
        exibirTarefaMaisDemorada(equipe);
    }

    public static int contarDesenvolvedores(ArrayList<Desenvolvedor> equipe) {
        int total = 0;
        for (Desenvolvedor dev : equipe) {
            total++;
        }
        return total;
    }

    public static int contarPorCargo(ArrayList<Desenvolvedor> equipe, String cargo) {
        int total = 0;
        for (Desenvolvedor dev : equipe) {
            if (dev.getCargo().equals(cargo)) {
                total++;
            }
        }
        return total;
    }

    public static int contarTarefas(ArrayList<Desenvolvedor> equipe) {
        int total = 0;
        for (Desenvolvedor dev : equipe) {
            for (Tarefa tarefa : dev.getTarefas()) {
                total++;
            }
        }
        return total;
    }

    public static void listarBugsAbertos(ArrayList<Desenvolvedor> equipe) {
        int total = 0;
        for (Desenvolvedor dev : equipe) {
            for (Tarefa tarefa : dev.getTarefas()) {
                if (tarefa.getTipo().equals("Bug") && !tarefa.isConcluida()) {
                    tarefa.exibirResumo();
                    total++;
                }
            }
        }
        System.out.println("Total de bugs abertos: " + total);
    }

    public static String devMaisSobrecarregado(ArrayList<Desenvolvedor> equipe) {
        String nomeMaisSobrecarregado = "";
        double maiorTotalHoras = -1;

        for (Desenvolvedor dev : equipe) {
            double totalHoras = 0;

            for (Tarefa tarefa : dev.getTarefas()) {
                if (!tarefa.isConcluida()) {
                    totalHoras += tarefa.calcularHorasEstimadas();
                }
            }

            if (totalHoras > maiorTotalHoras) {
                maiorTotalHoras = totalHoras;
                nomeMaisSobrecarregado = dev.getNome();
            }
        }

        return String.format("%s (%.1fh)", nomeMaisSobrecarregado, maiorTotalHoras);
    }

    public static void exibirTarefaMaisDemorada(ArrayList<Desenvolvedor> equipe) {
        Tarefa tarefaMaisDemorada = null;
        String responsavel = "";
        double maiorEstimativa = -1;

        for (Desenvolvedor dev : equipe) {
            for (Tarefa tarefa : dev.getTarefas()) {
                double horas = tarefa.calcularHorasEstimadas();

                if (horas > maiorEstimativa) {
                    maiorEstimativa = horas;
                    tarefaMaisDemorada = tarefa;
                    responsavel = dev.getNome();
                }
            }
        }

        if (tarefaMaisDemorada != null) {
            tarefaMaisDemorada.exibirResumo();
            System.out.println("Responsável: " + responsavel);
        } else {
            System.out.println("A equipe não possui tarefas.");
        }
    }
}
