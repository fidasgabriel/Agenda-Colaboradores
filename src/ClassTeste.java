import java.util.Arrays;
import java.util.Date;

public class ClassTeste {
    public static void main(String[] args) {

    Colaboraderes colab1 = new Colaboraderes("Lucas", 123213213, true, new Date(2007, 03, 22), new Date(2023, 5, 8), "Manhã");
    Colaboraderes colab2 = new Colaboraderes("Ismael", 23423523, false, new Date(2006, 11, 20), new Date(2022, 1, 25), "Noite");
    Colaboraderes colab3 = new Colaboraderes("Helena", 343242342, true, new Date(2006, 11, 1), new Date(2023, 4, 22), "Tarde");
    Agenda agenda1 = new Agenda(Arrays.asList(colab1, colab2, colab3));

        System.out.println("CPF Colaborador 1: " + colab1.getCpf());
        System.out.println("Nome Colaborador 1: " + colab1.getNome());
        System.out.println("Período Colaborador 1: " + colab1.getPeriodo());
        System.out.println("Telefone Colaborador 1: " + colab1.getTelefone());
        System.out.println("Nascimento Colaborador 1: " + colab1.getDataNascimento());
        System.out.println("Data agendamento Colaborador 1: " + colab1.getDataAgendamento());
        System.out.println("Presentes na Lista são do grupo: " + agenda1.getAgenda());
    }
}
