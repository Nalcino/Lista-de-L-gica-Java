public class EX56 {
    public static void main(String[] args) {
        int num = 50;
        int div = 1;

        if(num > 0){
            do {
                if (num % div == 0) {
                    System.out.println(div);
                }
                div++;
            } while (div <= num);
        }
    }
}
