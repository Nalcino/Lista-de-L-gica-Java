import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para sua tabuada: ");
        int numero = entrada.nextInt();
        int i = 1;
        do {
            int cont = numero  * i;
            System.out.println(numero + " x " + i + " = " + cont);
            i++;
        } while (i <= 10);

    }
}
