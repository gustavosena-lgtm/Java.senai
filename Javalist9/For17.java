package Javalist9;
import java.util.Scanner;
public class For17 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número positivo: ");
            int numero = entrada.nextInt();

            System.out.println("Divisores de " + numero + ":");

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }

            entrada.close();
        }
    }

