public class EX54 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 1;
        int numero;

        do {
            numero = (int) (Math.random() * 100);
            soma += numero;
            contador++;
        } while (contador <= 5);

        double media = soma / 5.0;
        System.out.println("A média dos números é: " + media);
    }
}
