public class EX76 {
    public static void main(String[] args) {
        int num = 50;
        int Pares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                Pares += i;
            }
        }
        System.out.println("A soma dos números pares entre 1 e " + num + " é: " + Pares);
    }
}
