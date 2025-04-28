import java.util.Scanner;

public class atv24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num > 0) {
                System.out.println("Positivo");
            } else if (num < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        scanner.close();
    }
}
