import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica: ");
        double custoFabrica = scanner.nextDouble();
        double impostos = custoFabrica * 0.45;
        double custoComImpostos = custoFabrica + impostos;
        double distribuidor = custoComImpostos * 0.28;
        double custoConsumidor = custoComImpostos + distribuidor;
        System.out.println("Custo ao consumidor: R$" + custoConsumidor);
        scanner.close();
    }
}
