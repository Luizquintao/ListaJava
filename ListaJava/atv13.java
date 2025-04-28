import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 10) {
            System.out.println("Número maior que 10");
        }
        scanner.close();
    }
}
