void main() {

        Scanner input = new Scanner(System.in);
        int[] dia = new int[5];
        double fatotal=0;
        double medvendas=0;
        double abaixodamedia;
        double quantabaixo = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor das vendas do dia " + (i + 1) + ":");
            dia[i] = input.nextInt();
            fatotal += dia[i];
        }
        medvendas = fatotal / 5;
        System.out.println("O faturamento total acumulado é R$ " + fatotal);
        System.out.println("A média diária de vendas é de R$ " + medvendas);


        for (int i = 0; i < 5; i++) {
            if (dia[i] < medvendas) {
                quantabaixo = medvendas - dia[i];
                System.out.printf("Dia %d ficou abaixo da média diária com R$ %.2f%n", i+1, quantabaixo);
            }
        }
    }
