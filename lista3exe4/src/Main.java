import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("\n--- Exibindo a mensagem " + n + " vezes ---");

        for (int i = 1; i <= n; i++) {
            System.out.println("Praticando lógica de programação!");
        }


        scanner.close();
    }
}
