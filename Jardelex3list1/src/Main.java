import java.util.Scanner;
public class Main{
public static  void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int idade;
    int idadeMe;

    System.out.println("digite a sua idade?");
    idade = input.nextInt();
    idadeMe = idade *12;

    System.out.println("Essa e a sua idade em meses: "+ ""+ idadeMe);
}
}