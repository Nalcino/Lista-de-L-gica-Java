public class EX97 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2},
                {3, 4}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int n = 0; n < matriz[i].length; n++) {
                soma += matriz[i][n];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
