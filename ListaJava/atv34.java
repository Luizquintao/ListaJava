import java.util.Scanner;

public class atv34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();
        System.out.print("Digite a quantidade de horas/aula: ");
        int horas = scanner.nextInt();

        double valorHora;
        if (nivel == 1) {
            valorHora = 12.00;
        } else if (nivel == 2) {
            valorHora = 17.00;
        } else if (nivel == 3) {
            valorHora = 25.00;
        } else {
            System.out.println("Nível inválido.");
            scanner.close();
            return;
        }

        double salario = valorHora * horas;
        System.out.println("Salário do professor: R$" + salario);

        scanner.close();
    }
}
