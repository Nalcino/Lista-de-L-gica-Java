import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        int base = entrada.nextInt();
        System.out.print("Digite a altura do triângulo: ");
        int altura = entrada.nextInt();

        int area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}
