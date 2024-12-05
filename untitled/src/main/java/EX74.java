public class EX74 {
    public static void main(String[] args) {
        String[] nomes = {"Karina", "anderson", "annalisa", "bart", "Paulo"};
        int[] idades = {43, 43, 06, 8, 22};
        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
        }
        double mediaIdades = somaIdades / 5.0;

        System.out.println("A média das idades é: " + mediaIdades);
    }
}
