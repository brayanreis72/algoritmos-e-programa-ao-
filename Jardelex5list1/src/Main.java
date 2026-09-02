import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double altura;
        double peso;
        double IMC;
        System.out.println(" Qaul o seu peso em Kg: ");
        peso = input.nextDouble();
        System.out.println("Qual e a sua altura em metros:");
        altura = input.nextDouble();

        IMC = peso / altura * altura;
        System.out.println("O IMC calculado foi:" + " " + IMC);
    }
}