import java.util.Arrays;

public class atv42 {
    public static int[] ordenarCrescente(int a, int b, int c) {
        int[] valores = {a, b, c};
        Arrays.sort(valores);
        return valores;
    }

    public static void main(String[] args) {
        int[] ordenados = ordenarCrescente(5, 2, 8);
        System.out.println("Ordem crescente: " + Arrays.toString(ordenados));
    }
}
