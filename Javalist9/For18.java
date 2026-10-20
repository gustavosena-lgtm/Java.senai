package Javalist9;
import java.util.Scanner;
public class For18 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            boolean primo = numero > 1;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }

            entrada.close();
        }
    }

