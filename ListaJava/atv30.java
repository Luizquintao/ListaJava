import java.util.Scanner;

public class atv30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.next();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        System.out.print("Digite o salário fixo: ");
        double salario = scanner.nextDouble();

        double salarioLiquido = salario;
        if (sexo == 'M' && idade >= 30) {
            salarioLiquido = salario + 100;
        } else if (sexo == 'M' && idade < 30) {
            salarioLiquido = salario + 50;
        } else if (sexo == 'F' && idade >= 30) {
            salarioLiquido = salario + 200;
        } else if (sexo == 'F' && idade < 30) {
            salarioLiquido = salario + 80;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Salário líquido: R$" + salarioLiquido);
        scanner.close();
    }
}

