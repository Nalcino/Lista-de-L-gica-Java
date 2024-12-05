public class EX71 {
    public static void main(String[] args) {
        int numero = 50;

        if (numero <= 0) {
            System.out.println("Digite um número inteiro:.");
        } else {
            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
