
void main() {
    Scanner input = new Scanner (System.in);
    int n1;
    int n2;
    int n3;
    int maior;
    System.out.println("Informe o primeiro número:");
    n1 = input.nextInt();
    System.out.println("Informe o segundo número:");
    n2 = input.nextInt();
    System.out.println("Informe o terceiro número:");
    n3 = input.nextInt();
    if (n1 >= n2 && n1 >= n3) {
        maior = n1;
        System.out.println("O numero maior é" + "" + n1);
    } else if (n2 >= n1 && n2 >= n3) {
        maior = n2;
        System.out.println("O numero maior é" + "" + n2);
    } else {
        System.out.println("O numero maior é" + "" + n3);
    }

}
