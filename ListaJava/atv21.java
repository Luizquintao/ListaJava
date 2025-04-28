import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aptos = 0, inaptos = 0;

        System.out.print("Digite a quantidade de pessoas: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome: ");
            String nome = scanner.next();
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite a saúde (B para boa, R para ruim): ");
            char saude = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'M' && idade >= 18 && idade <= 45 && saude == 'B') {
                System.out.println(nome + " está apto para o serviço militar.");
                aptos++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar.");
                inaptos++;
            }
        }

        System.out.println("Total aptos: " + aptos);
        System.out.println("Total inaptos: " + inaptos);
        scanner.close();
    }
}
