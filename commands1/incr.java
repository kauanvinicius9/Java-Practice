import java.util.Scanner;

public class incr {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int incremento;

    // Solicita o número
    System.out.println("Escreva um número: ");
    numero = scan.nextInt();

    // Solicita o incremento
    System.out.println("Escreva o incremento: ");
    incremento = scan.nextInt();

    // Exibe o resultado
    System.out.println("\nResultado:");

    for (int i = 0; i <= numero; i += incremento) {
        System.out.println(i);

    }

    scan.close();

   }
}