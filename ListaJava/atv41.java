public class atv41 {
    public static boolean ehPerfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma == numero;
    }

    public static void main(String[] args) {
        int numero = 6; // exemplo
        System.out.println("O número " + numero + " é perfeito? " + ehPerfeito(numero));
    }
}
