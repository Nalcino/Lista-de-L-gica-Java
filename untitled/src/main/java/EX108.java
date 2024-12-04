public class EX108 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 8, 3, 4},
                {5, 2, 7, 6},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int n = 1; n < 4; n++) {
                if (matriz[i][n] > maior) {
                    maior = matriz[i][n];
                }
            }
            System.out.println("a maior  linha " + i + ": " + maior);
        }
    }
}
