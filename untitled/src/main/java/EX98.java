public class EX98 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
