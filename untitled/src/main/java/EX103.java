public class EX103 {
    public static void main(String[] args) {
        int[][] matriz = {
                {9, 5, 3},
                {7, 2, 8},
                {4, 6, 1}
        };
        int menor = matriz[0][0];

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                if (matriz[i][n] < menor) {
                    menor = matriz[i][n];
                }
            }
        }
        System.out.println("O menor valor: " + menor);
    }
}
