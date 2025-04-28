import java.util.Scanner;

public class atv36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de Cliente (1-Residência, 2-Comércio, 3-Indústria): ");
        int tipo = scanner.nextInt();

        System.out.println("Consumo em KW/h: ");
        double consumo = scanner.nextDouble();

        double precoKw = 0;
        switch (tipo) {
            case 1: precoKw = 0.60; break;
            case 2: precoKw = 0.48; break;
            case 3: precoKw = 1.29; break;
            default:
                System.out.println("Tipo inválido!");
                scanner.close();
                return;
        }

        double valorConta = consumo * precoKw;
        System.out.println("Valor da conta de luz: R$ " + valorConta);

        scanner.close();
    }
}
