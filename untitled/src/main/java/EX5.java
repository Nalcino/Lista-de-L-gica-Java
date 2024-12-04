import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        float preco = entrada.nextFloat();
        System.out.println("Digite a quantidade do produto :");
        int quantidade = entrada.nextInt();


        if (quantidade > 10) {
            float total = preco * quantidade;
            float totalComDesconto = (float) (total - (total * 0.10));
            System.out.println("O valor total com desconto de 10% é: " + totalComDesconto);
        } else if (quantidade <= 10) {
            System.out.println("O valor total sem desconto é: " + preco * quantidade);
        } else {
            System.out.println("tente novamente");
        }
    }
}
