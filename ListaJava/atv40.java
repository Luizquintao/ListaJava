import java.util.Scanner;

public class atv40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Grupo de risco (1, 2 ou 3): ");
        int grupo = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Idade fora da faixa permitida.");
        } else {
            String categoria = "";

            if (idade >= 17 && idade <= 20) {
                categoria = (grupo == 1) ? "Categoria 1" : (grupo == 2) ? "Categoria 2" : "Categoria 3";
            } else if (idade >= 21 && idade <= 24) {
                categoria = (grupo == 1) ? "Categoria 2" : (grupo == 2) ? "Categoria 3" : "Categoria 4";
            } else if (idade >= 25 && idade <= 34) {
                categoria = (grupo == 1) ? "Categoria 3" : (grupo == 2) ? "Categoria 4" : "Categoria 5";
            } else if (idade >= 35 && idade <= 64) {
                categoria = (grupo == 1) ? "Categoria 4" : (grupo == 2) ? "Categoria 5" : "Categoria 6";
            } else if (idade >= 65 && idade <= 70) {
                categoria = (grupo == 1) ? "Categoria 7" : (grupo == 2) ? "Categoria 8" : "Categoria 9";
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: " + categoria);
        }

        scanner.close();
    }
}
