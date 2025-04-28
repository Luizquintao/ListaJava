import java.util.Scanner;

public class atv29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();

        String nomeMes;
        switch (mes) {
            case 1 -> nomeMes = "Janeiro";
            case 2 -> nomeMes = "Fevereiro";
            case 3 -> nomeMes = "Março";
            case 4 -> nomeMes = "Abril";
            case 5 -> nomeMes = "Maio";
            case 6 -> nomeMes = "Junho";
            case 7 -> nomeMes = "Julho";
            case 8 -> nomeMes = "Agosto";
            case 9 -> nomeMes = "Setembro";
            case 10 -> nomeMes = "Outubro";
            case 11 -> nomeMes = "Novembro";
            case 12 -> nomeMes = "Dezembro";
            default -> nomeMes = "Mês inválido";
        }

        System.out.println(nomeMes);
        scanner.close();
    }
}
