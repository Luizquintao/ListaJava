import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        double prestacao = valorCompra / 5;
        System.out.println("Valor de cada prestação: R$" + prestacao);
        scanner.close();
    }
}
