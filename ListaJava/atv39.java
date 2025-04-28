import java.util.Scanner;

public class atv39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do estudante: ");
        String nome = scanner.nextLine();
        System.out.print("Número de matrícula: ");
        int matricula = scanner.nextInt();
        System.out.print("Nota do Trabalho de Laboratório: ");
        double notaLab = scanner.nextDouble();
        System.out.print("Nota da Avaliação Semestral: ");
        double notaSem = scanner.nextDouble();
        System.out.print("Nota do Exame Final: ");
        double notaExame = scanner.nextDouble();

        double notaFinal = (notaLab * 2 + notaSem * 3 + notaExame * 5) / 10;

        String classificacao;
        if (notaFinal >= 8) classificacao = "A";
        else if (notaFinal >= 7) classificacao = "B";
        else if (notaFinal >= 6) classificacao = "C";
        else if (notaFinal >= 5) classificacao = "D";
        else classificacao = "R";

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
