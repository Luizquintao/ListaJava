import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num > 80) {
            System.out.println("Maior que 80");
        } else if (num < 25) {
            System.out.println("Menor que 25");
        } else if (num == 40) {
            System.out.println("Igual a 40");
        } else {
            System.out.println("Número fora das condições especificadas.");
        }
        scanner.close();
    }
}
