void main() {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> palpitesErrados= new ArrayList <Integer>();
        int tenta =0;
        int palpite;
        int secreto= 32;
        do {
            System.out.println("Digite seu palpite: ");
            palpite = input.nextInt();

            tenta++;

            if (palpite != secreto){
                palpitesErrados.add (palpite);

                if (palpite < secreto){
                    System.out.println("O número secreto é maior.");
                }else {
                    System.out.println("O número secreto é menor.");
                }
            }
        } while (palpite!= secreto);

        System.out.println("PARABÉNS, VOCÊ ACERTOU!");
        System.out.println("Você tentou "+ tenta + " vezes.");
        System.out.println("Palpites errados:");

        for (int i = 0; i < palpitesErrados.size(); i++) {
            System.out.println(palpitesErrados.get(i));
        }

    }
