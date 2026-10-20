package Javalist9;
import java.util.Scanner;
public class For9 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);

            entrada.close();
        }
    }

