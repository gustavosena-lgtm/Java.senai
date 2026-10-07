package revisaoJava;
import java.util.Scanner;
public class Exercicio16 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("O número é divisível por 2, 3 e 5 ao mesmo tempo.");
            } else {
                System.out.println("O número não é divisível por 2, 3 e 5 ao mesmo tempo.");
            }

            entrada.close();
        }
    }

