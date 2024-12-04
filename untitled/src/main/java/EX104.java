public class EX104 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}
        };
        boolean simetrica = true;

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                if (matriz[i][n] != matriz[n][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        System.out.println("A matriz é : " + simetrica);
    }
}
