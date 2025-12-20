import java.util.Scanner;

public class risk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados tipados
        int totalPessoas = 0;
        int positivos = 0;
        int negativos = 0;
        char continuar;

        do {
            System.out.println("Digite o saldo da pessoa: ");
            double saldo = sc.nextDouble();

            totalPessoas++;

            // Condições
            if (saldo >= 0) {
                positivos++;

            } else {
                negativos++;

            }

            System.out.println("Deseja continuar? ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        // Resultados dos dados
         System.out.println("\nTotal de pessoas: " + totalPessoas);
         System.out.println("Saldos positivos: " + positivos);
         System.out.println("Saldos negativos: " + negativos);

         if (positivos >= totalPessoas * 0.5) {
             System.out.println("Não há riscos");

         } else {
             System.out.println("Há riscos ao banco");

         }

         sc.close();

    }
}