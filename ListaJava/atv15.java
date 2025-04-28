import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Número está entre 100 e 200");
        } else {
            System.out.println("Número fora do intervalo");
        }
        scanner.close();
    }
}
