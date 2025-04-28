public class atv44 {
    public static double calcularS(int n) {
        double s = 1.0;
        double fatorial = 1.0;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            s += 1.0 / fatorial;
        }

        return s;
    }

    public static void main(String[] args) {
        int n = 5; // Exemplo
        System.out.println("Valor de S: " + calcularS(n));
    }
}
