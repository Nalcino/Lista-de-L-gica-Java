import java.util.Scanner;

public class EX78 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        String numeroStr = Integer.toString(numero);

        System.out.println("Os dígitos do número são:");
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }

        entrada.close();
    }
}
