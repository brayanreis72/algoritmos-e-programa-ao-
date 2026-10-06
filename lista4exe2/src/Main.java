import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    double salario = 0;
    int numeroFilhos = 0;
    double somaSalarios = 0;
    double somaFilhos = 0;
    double qtdePessoas = 0;
    double mediaSalarios = 0;
    double mediaFilhos = 0;
    double maiorSalario = 0;
   double qtdeMenosSalarioMinimo = 0;
    int continuar = 1;


    while (continuar == 1) {
        System.out.print("informe seu salario: ");
        salario = scanner.nextDouble();
        System.out.print("Informe o n° de filhos: ");
        numeroFilhos = scanner.nextInt();

        somaSalarios = somaSalarios + salario;
        somaFilhos = somaFilhos + numeroFilhos;
        qtdePessoas++;

        if (salario > maiorSalario) {
            maiorSalario = salario;
        }
        if (salario <= 1621.0){
            qtdeMenosSalarioMinimo ++;
        }

            System.out.print(" Deseja continuar?");
            System.out.print("1 - SIM");
            System.out.print("2 - NÂO");
            System.out.print("Escolha uma opçao:");
            continuar = scanner.nextInt();


        }
        mediaSalarios = somaSalarios / qtdePessoas;
        System.out.println("A media de salarios é: " + mediaSalarios);

        mediaFilhos = somaFilhos / qtdePessoas;
        System.out.println("A media de filhos e:" + mediaFilhos);
        System.out.println("O maior salario e:" + maiorSalario);
        System.out.println(" Quantidade de pessoas que recebe ate 1  salario minimo :" + qtdeMenosSalarioMinimo);
        System.out.println("% de pessoas abaixo de 1 salario minimo: " + qtdeMenosSalarioMinimo / qtdePessoas * 100 + "%");

    }
