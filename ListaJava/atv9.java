import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor depositado: ");
        double deposito = scanner.nextDouble();
        double rendimento = deposito * 0.007;
        double total = deposito + rendimento;
        System.out.println("Valor após um mês: R$" + total);
        scanner.close();
    }
}

