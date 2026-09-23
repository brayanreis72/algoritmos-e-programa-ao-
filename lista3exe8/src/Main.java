import java.util.Locale;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Sistema de Processamento de Doações ");
        System.out.print("Informe a quantidade total de doações recebidas no dia: ");
        int totalDoacoes = scanner.nextInt();


        if (totalDoacoes <= 0) {
            System.out.println("Nenhuma doação para processar.");
            scanner.close();
            return;
        }

        double valorTotal = 0.0;
        double maiorValor = 0.0;
        double menorValor = 0.0;

        for (int i = 1; i <= totalDoacoes; i++) {
            System.out.print("Digite o valor da doação " + i + " (R$): ");
            double valorAtual = scanner.nextDouble();


            valorTotal += valorAtual;


            if (i == 1) {
                maiorValor = valorAtual;
                menorValor = valorAtual;
            } else {

                if (valorAtual > maiorValor) {
                    maiorValor = valorAtual;
                }
                if (valorAtual < menorValor) {
                    menorValor = valorAtual;
                }
            }
        }

        System.out.println("\n--- Relatório Final de Arrecadação ---");
        System.out.printf("Valor total arrecadado: R$ %.2f%n", valorTotal);
        System.out.printf("Maior valor doado: R$ %.2f%n", maiorValor);
        System.out.printf("Menor valor doado: R$ %.2f%n", menorValor);

        scanner.close();
    }
    }
