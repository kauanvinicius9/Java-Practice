import java.util.Scanner;

public class iap {
  public static void Main(String[] args) {
    Scanner ss = new Scanner(System.in);
    int idade = new int[10];
    float altura = new int[10];
    int peso = new int[10];

    // Ler as 10 idades
    System.out.println("Digite as 10 idades: ");
    for (int i = 0; i < 10; i++) {
      System.out.println("Idade: " + (i));
      idade[i] = ss.nextInt();

    }

    // Ler as 10 alturas
    System.out.println("Digite as 10 alturas: ");
    for (float i = 0; i < 10; i++) {
      System.out.println("Altura: " + (i));
      altura[i] = ss.nextInt();

    }

     // Ler os 10 pesos
    System.out.println("Digite os 10 pesos: ");
    for (int i = 0; i < 10; i++) {
      System.out.println("Peso: " + (i));
      peso[i] = ss.nextInt();

    }

    while (true) {
      // Opções
      System.out.println("\nO que deseja saber?");
      System.out.println("1. Quantas tem idade acima de 50 anos");
      System.out.println("2. Quantas tem altura acima de 1.60km");
      System.out.println("3. Quantas tem peso abaixo de 80kg");

      System.out.println("\nEscolha uma das opções: ");
      int opcao = ss.nextInt();

      int contador = 0;

      switch (opcao) {
        case 1:
          for (int n : idade) {
                if (n > 50) {
                contador++;
            }
        }

        System.out.println("Idade acima de 50 anos: " + contador);
        break;

        case 2:
            for (float n : altura) {
                  if (n > 1.60) {
                  contador++;
              }
          }

          System.out.println("Altura acima de 1.60: " + contador);
          break;

        case 3:
            for (int n : peso) {
              if (n < 80) {
                contador++;
              }
          }

          System.out.println("Peso abaixo de 80kg: " + contador);
          break;

        case 4:
           System.out.println("Encerrando...");
           ss.close();
           break;

        default:
            System.out.println("Opção não identificada");

      }
    }
  }
}