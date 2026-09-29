import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);

    int numero = 0;
    int fatorial = 1;
    int i;

    System.out.print("Digite um numero inteiro:");
    numero = input.nextInt();

    for ( i = numero; i> 1; i--) {
        fatorial = fatorial * i;
    }
    System.out.print("O fatorial do numero inteiro e:" + fatorial);


}
