public class EX105 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{1, 2}, {3, 4}};
        boolean iguais = true;

        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 2; n++) {
                if (matriz1[i][n] != matriz2[i][n]) {
                    iguais = false;
                    break;
                }
            }
        }
        System.out.println("As matrizes que são iguais: " + iguais);
    }
}
