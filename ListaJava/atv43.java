public class atv43 {
    public static void tabuada(int n, String operador, int t) {
        for (int i = 1; i <= t; i++) {
            switch (operador.toLowerCase()) {
                case "soma":
                    System.out.println(n + " + " + i + " = " + (n + i));
                    break;
                case "subtracao":
                    System.out.println(n + " - " + i + " = " + (n - i));
                    break;
                case "multiplicacao":
                    System.out.println(n + " * " + i + " = " + (n * i));
                    break;
                case "divisao":
                    if (i != 0) {
                        System.out.println(n + " / " + i + " = " + ((double)n / i));
                    } else {
                        System.out.println("Divisão por zero não permitida.");
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
            }
        }
    }

    public static void main(String[] args) {
        tabuada(5, "soma", 10);
    }
}
