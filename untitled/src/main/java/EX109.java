public class EX109 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                if (i == n && matriz[i][n] != 1) {
                    identidade = false;
                } else if (i != n && matriz[i][n] != 0) {
                    identidade = false;
                }
            }
        }
        System.out.println("A matriz é  " + identidade);
    }
}
