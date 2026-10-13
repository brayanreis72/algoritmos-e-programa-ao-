void main() {

        Scanner input = new Scanner(System.in);
        double[] kg = new double[6];
        double peso;
        int quant = 0;
        int resp=0;

        do {
            for (int i = 0; i < 6; i++) {
                System.out.println("Digite o peso da caixa " + (i + 1) + ":");
                kg[i] = input.nextDouble();

            }

            System.out.println("Digite o peso de preferência: ");
            peso = input.nextDouble();

            for (int i = 0; i < 6; i++) {
                if (peso == kg[i]) {
                    quant++;
                }

            }
            if (quant == 0) {
                System.out.println("Valor não localizado na amostragem");
            } else {
                System.out.println("Valor " + peso + " encontrado " + quant + " vezes.");

            } System.out.println("Quer continuar? [1]Sim [2]Não");
            resp = input.nextInt();

        }while (resp ==1);
        if (resp==2){
            System.out.println("OBRIGADA PELA PREFERÊNCIA!");
        }
    }
