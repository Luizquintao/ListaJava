import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carrosAte2000 = 0;
        int totalCarros = 0;

        String continuar;

        do {
            System.out.print("Digite o ano do veículo: ");
            int ano = scanner.nextInt();
            System.out.print("Digite o valor do veículo: ");
            double valor = scanner.nextDouble();

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                carrosAte2000++;
            } else {
                desconto = valor * 0.07;
            }

            double valorFinal = valor - desconto;

            System.out.println("Valor do desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + valorFinal);

            totalCarros++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Total de carros até 2000: " + carrosAte2000);
        System.out.println("Total de carros no geral: " + totalCarros);
        scanner.close();
    }
}
