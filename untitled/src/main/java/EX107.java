public class EX107 {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int produto = 1;

        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][2 - i];
        }
        System.out.println("A diagonal secundária é: " + produto);
    }
}
