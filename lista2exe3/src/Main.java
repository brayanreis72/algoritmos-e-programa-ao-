import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1;
        double conta;

        System.out.println("Informe um valor:");
        N1 = input.nextInt();

        if (N1 % 2==0) {
            conta = N1 * N1;
            System.out.printf("O número é par, e o quadrado é igual a: %.2f%n", conta);



        }else{
            conta = N1 * N1 * N1;
            System.out.printf("O número é impar, e o cubo é igual a: %.2f%n", conta);






        }

    }
}