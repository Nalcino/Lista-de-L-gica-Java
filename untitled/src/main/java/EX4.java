import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = entrada.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = entrada.nextInt();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        int soma = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

        int somaPesos = peso1 + peso2 + peso3;
        double media = (double) soma / somaPesos;

        System.out.printf("A média ponderada é: %.2f%n", media);
    }
}
