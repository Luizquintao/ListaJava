import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHomens = 0, totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo == 'F') {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        scanner.close();
    }
}
