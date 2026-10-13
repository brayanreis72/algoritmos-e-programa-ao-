import java.util.Scanner;
void main() {

        Scanner input = new Scanner(System.in);

        int [] dia = new int [5];
        double total = 0;
        double media = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a temperatura do dia " + (i+1));
            dia [i] = input.nextInt();
            total += dia[i];

        }
        media = total / 5;
        System.out.println("Temperatura média: " + media);

        System.out.println("Dias com temperatura acima da média:");
        for (int i = 0; i <  5; i++)
            if (dia[i] > media) {
                System.out.println("Dia "+ (i+1) + ": "+ dia[i]);

            }


    }