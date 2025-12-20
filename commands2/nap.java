import java.util.Scanner;

public class risk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados tipados
        String nomePesada = "";
        double maiorPeso = 0;

        String nomeAlta = "";
        double maiorAltura = 0;

        // Fórmula
        for (int i = 1; i <= 6; i++) {
             System.out.println("\nPessoa " + i);

              System.out.println("Nome: ");
              String nome = sc.next();

               System.out.println("Altura em metros: ");
               double altura = sc.nextDouble();

                System.out.println("Peso em KG: ");
                double peso = sc.nextDouble();

                // Tratativas de erros
                if (peso > maiorPeso) {
                    maiorPeso = peso;
                    nomePesada = nome;

                }

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    nomeAlta = nome;

                }
        }

        // Saída de dados concatenados (String + Variável)
        System.out.println("\nPessoa mais pesada: " + nomeMaisPesada + " | Peso: " + maiorPeso + " kg");
        System.out.println("Pessoa mais alta: " + nomeMaisAlta + " | Altura: " + maiorAltura + " m");

    }
}