import java.util.Scanner;

public class atv26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Um");
            case 2 -> System.out.println("Dois");
            case 3 -> System.out.println("Três");
            case 4 -> System.out.println("Quatro");
            case 5 -> System.out.println("Cinco");
            default -> System.out.println("Número inválido.");
        }
        scanner.close();
    }
}
