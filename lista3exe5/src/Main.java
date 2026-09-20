import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada do " + numero + " ---");


        for (int i = 1; i <= 10; i++) {


            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }


        scanner.close();
    }
}