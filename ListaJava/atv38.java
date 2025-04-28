import java.util.Scanner;

public class atv38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota do Trabalho de Laboratório: ");
        double notaLab = scanner.nextDouble();
        System.out.print("Nota da Avaliação Semestral: ");
        double notaSem = scanner.nextDouble();
        System.out.print("Nota do Exame Final: ");
        double notaExame = scanner.nextDouble();

        double media = (notaLab * 2 + notaSem * 3 + notaExame * 5) / 10;
        System.out.println("Nota final: " + media);

        scanner.close();
    }
}
