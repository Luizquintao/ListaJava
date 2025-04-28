import java.util.Scanner;

public class atv25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else {
                System.out.println(num2 + " é maior que " + num1);
            }
            System.out.println("Os números são diferentes.");
        }
        scanner.close();
    }
}
