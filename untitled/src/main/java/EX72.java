public class EX72 {
    public static void main(String[] args) {
        int numero = 29;
        boolean Primo = true;

        if (numero <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    Primo = false;
                    break;
                }
            }
        }
        if (Primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
