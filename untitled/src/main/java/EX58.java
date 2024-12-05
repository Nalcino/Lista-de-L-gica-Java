public class EX58 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int num = 50;

        do {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        } while (c <= num);
    }
}
