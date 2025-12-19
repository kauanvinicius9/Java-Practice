import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Total, otimo, bom e ruim como inteiros
        int total = 0;
        int otimo = 0, bom = 0, ruim = 0;
        int soma = 0;
        char continuar;

        // Menu de opções
        do {
            System.out.println("Escreva a sua opinião:");
            System.out.println("1. Ótimo");
            System.out.println("2. Bom");
            System.out.println("3. Ruim");

            // Switch case
            int opn = sc.nextInt();

            switch (opn) {
                case 1:
                    otimo++;
                    soma += 1;
                    total++;
                    break;

                case 2:
                    bom++;
                    soma += 2;
                    total++;
                    break;

                case 3:
                    ruim++;
                    soma += 3;
                    total++;
                    break;

                default:
                    System.out.println("Opção não identificada");
                    continue;

            }

            System.out.println("Deseja continuar? ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        // Cálculo média
        double media = (double) soma / total;

        // Cálculo de porcentagens
        double percentualOtimo = (otimo * 100.0) / total;
        double percentualBom = (bom * 100.0) / total;
        double percentualRuim = (ruim * 100.0) / total;

        // Resultados
        System.out.println("\nTotal de respondentes: " + total);

        System.out.println("Ótimo: " + otimo + " (" + percentualOtimo + "%)");
        System.out.println("Bom: " + bom + " (" + percentualBom + "%)");
        System.out.println("Ruim: " + ruim + " (" + percentualRuim + "%)");
        System.out.println("Média de notas do filme: " + media);

        sc.close();

    } 
}