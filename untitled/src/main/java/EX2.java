import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int raio = entrada.nextInt();

        double pi = 3.14;

        double area = pi * raio * raio;
        double perimetro = 2 * pi * raio;


        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo é : " + perimetro);

    }
}
