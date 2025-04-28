import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 10 e 150: " + contador);
        scanner.close();
    }
}
