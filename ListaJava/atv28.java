import java.util.Scanner;

public class atv28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aumentoTotal = 0;

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        for (int i = 0; i < 584; i++) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.next();
            System.out.print("Digite o salário atual: ");
            double salario = scanner.nextDouble();

            double novoSalario;
            if (salario < 3 * salarioMinimo) {
                novoSalario = salario * 1.5;
            } else if (salario <= 10 * salarioMinimo) {
                novoSalario = salario * 1.2;
            } else if (salario <= 20 * salarioMinimo) {
                novoSalario = salario * 1.15;
            } else {
                novoSalario = salario * 1.1;
            }

            double aumento = novoSalario - salario;
            aumentoTotal += aumento;

            System.out.println("Funcionário: " + nome);
            System.out.println("Reajuste: R$" + aumento);
            System.out.println("Novo salário: R$" + novoSalario);
        }

        System.out.println("Aumento total da folha de pagamento: R$" + aumentoTotal);
        scanner.close();
    }
}
