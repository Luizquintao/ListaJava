import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar: ");
        double cotacao = scanner.nextDouble();
        System.out.print("Informe a quantidade de dólares: ");
        double quantidade = scanner.nextDouble();
        double reais = cotacao * quantidade;
        System.out.println("Valor em reais: R$" + reais);
        scanner.close();
    }
}
