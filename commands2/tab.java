import java.util.Scanner;

public class risk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um  número: ");
        int numero = scan.nextInt();

        // Fórmula da tabuada
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));

        }

        scan.close();

    }
}