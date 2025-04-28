import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Informe o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();
        double consumoMedio = distancia / combustivel;
        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        scanner.close();
    }
}
