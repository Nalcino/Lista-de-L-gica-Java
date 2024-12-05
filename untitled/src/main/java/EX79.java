import java.util.Scanner;

public class EX79 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = entrada.nextInt();

        if (num < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
        entrada.close();
    }
}
