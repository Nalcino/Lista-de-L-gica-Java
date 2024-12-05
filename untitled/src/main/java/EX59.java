public class EX59 {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;
        String nome = "";
        int idade = 0;
        do {
            System.out.println("Digite o nome de uma pessoa: " + contador);
            nome = System.console().readLine();
            System.out.println("Digite a idade : " + contador);
        } while (contador <= 5);
    }
}
