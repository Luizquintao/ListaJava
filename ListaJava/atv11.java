import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço de custo: ");
        double precoCusto = scanner.nextDouble();
        System.out.print("Digite o percentual de acréscimo: ");
        double percentual = scanner.nextDouble();
        double precoVenda = precoCusto + (precoCusto * percentual / 100);
        System.out.println("Preço de venda: R$" + precoVenda);
        scanner.close();
    }
}
