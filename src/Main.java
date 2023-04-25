import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Nome do colaborador: ");
        String colabNome = scan.nextLine();
        System.out.println("CPF do colaborador: ");
        Long colabCpf = scan.nextLong();
        System.out.println("Telefone do colaborador: ");
        Boolean colaTel = scan.nextBoolean();
        System.out.println("Dia Nascimento do colaborador: ");
        Integer colabNasDia = scan.nextInt();
        System.out.println("Mês Nascimento do colaborador: ");
        Integer colabNasMes = scan.nextInt();
        System.out.println("Ano Nascimento do colaborador: ");
        Integer colabNasAno = scan.nextInt();
        System.out.println("Dia Agenda do colaborador: ");
        Integer colabAgenDia = scan.nextInt();
        System.out.println("Mês Agenda do colaborador: ");
        Integer colabAgenMes = scan.nextInt();
        System.out.println("Ano Agenda do colaborador: ");
        Integer colabAgenAno = scan.nextInt();
        System.out.println("Período do colaborador: ");
        String colabPeri = scan.nextLine();

        Colaboraderes colabTeste = new Colaboraderes(colabNome, colabCpf, colaTel, new Date(colabNasAno, colabNasMes, colabNasDia), new  Date(colabAgenAno, colabAgenMes, colabAgenDia), colabPeri);

    }
}