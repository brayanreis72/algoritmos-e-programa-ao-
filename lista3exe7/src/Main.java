
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0.0;
        int quantidadeNotas = 0;

        System.out.println("Sistema de Leitura de Notas ");
        System.out.println("Digite as notas dos alunos (valores positivos).");
        System.out.println("Para encerrar e ver o resultado, digite um valor negativo.\n");

        System.out.print("Digite uma nota:'");
        double nota = scanner.nextDouble();


        while (nota >= 0) {
            somaNotas += nota;
            quantidadeNotas++;

            System.out.print("Digite uma nota:");
            nota = scanner.nextDouble();
        }

        System.out.println("\n--");


        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("Quantidade de notas válidas digitadas: " + quantidadeNotas);
            System.out.printf("Média aritmética das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada. Não foi possível calcular a média.");
        }

        scanner.close();
    }
}
