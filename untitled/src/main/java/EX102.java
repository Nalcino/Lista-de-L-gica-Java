public class EX102 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{5, 6}, {7, 8}};
        int[][] produto = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                for (int k = 0; k < 2; k++) {
                    produto[i][n] += matriz1[i][k] * matriz2[k][n];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                System.out.print(produto[i][n] + " ");
            }
            System.out.println();
        }
    }
}
