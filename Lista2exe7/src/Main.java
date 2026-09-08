import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorR;
        double valorPM;
        double conta;

        System.out.println(" Qual o valor da sua renda mensal?");
        valorR = entrada.nextDouble();

        System.out.println("Qual o valor550 mensal que você deseja pagar no financiamento?");
        valorPM = entrada.nextDouble();

        conta = valorR * 0.30;

        if (valorPM <= conta) {

            if (valorPM > 3000 && valorR < 10000) {
                System.out.println("Financiamento negado por baixa renda");
            } else {
                System.out.println("Financiamento aprovado");
            }

        } else {
            System.out.println("Financiamento negado por alta prestação");
        }
    }
}