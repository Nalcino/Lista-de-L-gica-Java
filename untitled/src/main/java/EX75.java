public class EX75 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.print(" 20 números da sequência de Fibonacci: ");

        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
