public class EX106 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int n = 0; n < 4; n++) {
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                soma += matriz[i][n];
            }
            System.out.println("Soma da coluna " + n + ": " + soma);
        }
    }
}
