import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print(" valor do depósito mensal: ");
        double depositoMensal = entrada.nextDouble();

        System.out.print("taxa de juros mensal (em %): ");
        double taxaJurosMensal = entrada.nextDouble();

        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + (taxaJurosMensal / 100));
        }
        System.out.printf("O montante após 12 meses é: R$%.2f%n", montante);
    }
}
