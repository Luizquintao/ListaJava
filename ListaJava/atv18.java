import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 75; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        scanner.close();
    }
}
