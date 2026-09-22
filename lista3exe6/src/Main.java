import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String senha = "0";
      String senhaPredefinida = "2028";
        int tentativas = 0;
                while (!senha.equals( senhaPredefinida)){
                    System.out.println("Digite a Senha");
                    senha = input.nextLine();
                    System.out.println("Senha Incorreta! Tente novamente");
                    if (senha != senhaPredefinida);
    }
    System.out.println("Acesso autorizado");
                System.out.println("Tentativa realizada");

}
}