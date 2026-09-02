import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double T1;
        double T2;
        double T3;
        double soma;
        double media;
        System.out.println("Digite o primeiro número:");
        T1 = input.nextDouble();
        System.out.println("Digite o segundo número:");
        T2 = input.nextDouble();
        System.out.println("Digite o terceiro número:");
        T3 = input.nextDouble();

        soma = T1 + T2 + T3;
        media = soma / 3;
        System.out.println("A soma dos números é " + "" + soma + "" + "" + "e a média entre eles é " + "" + media);


    }
}