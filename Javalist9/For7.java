package Javalist9;
import java.util.Scanner;
public class For7 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número N: ");
            int n = entrada.nextInt();

            int soma = 0;

            for (int i = 1; i <= n; i++) {
                soma += i;
            }

            System.out.println("A soma é: " + soma);

            entrada.close();
        }
    }

