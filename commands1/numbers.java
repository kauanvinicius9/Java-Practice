import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ler os 10 números
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

        }

        while (true) {
            // Menu de opções
            System.out.println("\nO que deseja saber?");
            System.out.println("1. Quantos números pares");
            System.out.println("2. Quantos números ímpares");
            System.out.println("3. Quantos números positivos");
            System.out.println("4. Quantos números negativos");
            System.out.println("5. Encerrar");

            System.out.println("\nEscolha uma das opções: ");
            int opcao = sc.nextInt();

            int contador = 0;

            switch (opcao) {
                case 1:
                    for (int n : numeros) {
                        if (n % 2 == 0) {
                            contador++;
                        }
                    }
                    System.out.println("Quantidade de números pares: " + contador);
                    break;

                case 2:
                    for (int n : numeros) {
                        if (n % 2 != 0) {
                            contador++;
                        }
                    }
                    System.out.println("Quantidade de números ímpares: " + contador);
                    break;

                case 3:
                    for (int n : numeros) {
                        if (n > 0) {
                            contador++;
                        }
                    }
                    System.out.println("Quantidade de números positivos: " + contador);
                    break;

                case 4:
                    for (int n :numeros) {
                        if (n < 0) {
                            contador++;
                        }
                    }
                    System.out.println("Quantidade de números negativos: " + contador);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção não identificada");

            }
        }
    }
}