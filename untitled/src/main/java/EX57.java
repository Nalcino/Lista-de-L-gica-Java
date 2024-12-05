public class EX57 {
    public static void main(String[] args) {
        int numero = 5;
        int i = 2;
        boolean primo = true;

        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= Math.sqrt(numero));
        System.out.println(primo ? "É primo" : "Não é primo");
    }
}
