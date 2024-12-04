public class EX99 {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matriz2 = {
                {5, 6},
                {7, 8}
        };
        int[][] somaMatrizes = new int[2][2];

        for (int i = 0; i < matriz1.length; i++) {
            for (int n = 0; n < matriz1[i].length; n++) {
                somaMatrizes[i][n] = matriz1[i][n] + matriz2[i][n];
            }
        }
        System.out.println("Soma das matrizes:");
        for (int i = 0; i < somaMatrizes.length; i++) {
            for (int n = 0; n < somaMatrizes[i].length; n++) {
                System.out.print(somaMatrizes[i][n] + " ");
            }
            System.out.println();
        }
    }
}
