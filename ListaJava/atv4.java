import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do vendedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário fixo: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Total de vendas no mês: ");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Salário final: R$" + salarioFinal);
        scanner.close();
    }
}
