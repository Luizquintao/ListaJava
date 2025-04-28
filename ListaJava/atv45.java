public class atv45 {
    public static double potencia(double x, int z) {
        return Math.pow(x, z);
    }

    public static void main(String[] args) {
        double x = 2;
        int z = 3;
        System.out.println(x + " elevado a " + z + " é: " + potencia(x, z));
    }
}
