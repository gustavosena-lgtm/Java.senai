package Javalist9;
import java.util.Scanner;
public class For13 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int pares = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = entrada.nextInt();

                if (numero % 2 == 0) {
                    pares++;
                }
            }

            System.out.println("Quantidade de números pares: " + pares);

            entrada.close();
        }
    }

