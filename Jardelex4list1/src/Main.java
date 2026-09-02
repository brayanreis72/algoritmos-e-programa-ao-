import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;
        double porc;
        double novoV;
        System.out.println("Qual o valor do produto: ");
        valor = input.nextDouble();
        porc = valor * 10 / 100;
        novoV = valor - porc;

        System.out.println("O produto com 10% de desconto é" + " " + novoV);
    }
}