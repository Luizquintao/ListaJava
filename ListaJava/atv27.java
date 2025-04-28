import java.util.Scanner;

public class atv27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalDesconto = 0, totalPago = 0;

        while (true) {
            System.out.print("Digite o valor do veículo (0 para encerrar): ");
            double valor = scanner.nextDouble();
            if (valor == 0) break;

            System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina, D-Diesel): ");
            char combustivel = scanner.next().toUpperCase().charAt(0);

            double desconto;
            if (combustivel == 'A') {
                desconto = valor * 0.25;
            } else if (combustivel == 'G') {
                desconto = valor * 0.21;
            } else if (combustivel == 'D') {
                desconto = valor * 0.14;
            } else {
                System.out.println("Tipo de combustível inválido.");
                continue;
            }

            double valorPago = valor - desconto;
            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + valorPago);

            totalDesconto += desconto;
            totalPago += valorPago;
        }

        System.out.println("Total de descontos concedidos: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);
        scanner.close();
    }
}
