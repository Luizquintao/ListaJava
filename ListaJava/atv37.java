import java.util.Scanner;

public class atv37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            if (altura > 1.70) {
                pesoIdeal = (idade <= 20) ? (72.7 * altura) - 58 : (72.7 * altura) - 53;
            } else {
                pesoIdeal = (idade <= 40) ? (72.7 * altura) - 50 : (72.7 * altura) - 45;
            }
        } else {
            if (altura > 1.60) {
                pesoIdeal = (idade <= 20) ? (62.1 * altura) - 44.7 : (62.1 * altura) - 40.7;
            } else {
                pesoIdeal = (idade <= 40) ? (62.1 * altura) - 42.7 : (62.1 * altura) - 37.7;
            }
        }

        System.out.println("Nome: " + nome);
        System.out.printf("Peso ideal: %.2f kg\n", pesoIdeal);

        scanner.close();
    }
}

