public class EX60 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i = 1;

        do {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
            i++;
        } while (i <= 20);
    }
}
