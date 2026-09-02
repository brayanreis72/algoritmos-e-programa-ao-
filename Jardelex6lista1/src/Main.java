import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double salario;
    double aumento;
    double Satual;

    System.out.println("Qual o salário atual:");
    salario = input.nextInt();
    aumento = salario * 10/100;
    System.out.println("O seu  aumento é de :" + " "+ aumento);
    Satual = salario + aumento;

    System.out.println("Seu salario salário reajustado é" + " " + Satual);

}
}