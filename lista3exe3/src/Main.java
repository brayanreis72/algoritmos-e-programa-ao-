import java.util.Scanner;
public class Main {


    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {


        int inicio = 1;
        int fim = 20;

        System.out.println("--- Analisando números de " + 1 + " a " + 20 + " ---");

        for (int i = 1; i <= 20; i++) {

            boolean resultado = ehPar(i);
            if (i % 2 == 0)

                if (resultado) {
                    System.out.println("O número " + i);
                }
        }
    }
}
