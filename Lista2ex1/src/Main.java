import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println(" Informe sua idade:");
        idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.println(" A sua categoria e infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A sua categoria e juvenil");
        } else {
            System.out.println("A sua categoria e adulto");
        }


    }
}
