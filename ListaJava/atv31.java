import java.util.Scanner;
import java.util.Arrays;

public class atv31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[3];
        System.out.print("Digite o primeiro valor: ");
        valores[0] = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valores[1] = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valores[2] = scanner.nextInt();

        Arrays.sort(valores);

        System.out.println("Valores em ordem crescente:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        scanner.close();
    }
}

