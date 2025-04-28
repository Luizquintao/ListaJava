import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaCusto = 0, somaVenda = 0;

        for (int i = 0; i < 40; i++) {
            System.out.print("Digite o preço de custo do produto: ");
            double custo = scanner.nextDouble();
            System.out.print("Digite o preço de venda do produto: ");
            double venda = scanner.nextDouble();

            somaCusto += custo;
            somaVenda += venda;

            if (venda > custo) {
                System.out.println("Lucro");
            } else if (venda < custo) {
                System.out.println("Prejuízo");
            } else {
                System.out.println("Empate");
            }
        }

        System.out.println("Média do preço de custo: " + (somaCusto / 40));
        System.out.println("Média do preço de venda: " + (somaVenda / 40));
        scanner.close();
    }
}
