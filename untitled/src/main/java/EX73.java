public class EX73 {
    public static void main(String[] args) {
        int num = 10;
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + num + ": ");

        for (int i = 0; a <= num; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
