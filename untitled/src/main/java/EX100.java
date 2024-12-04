public class EX100 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                if (matriz[i][n] > maior) {
                    maior = matriz[i][n];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}
