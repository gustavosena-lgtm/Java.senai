package revisaoJava;
import java.util.Scanner;

public class Exercicio11 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if ((numero % 2 == 0 && numero < 100) ||
                    (numero % 2 != 0 && numero > 100)) {

                System.out.println("O número atende à condição.");
            } else {
                System.out.println("O número não atende à condição.");
            }

            entrada.close();
        }
    }

