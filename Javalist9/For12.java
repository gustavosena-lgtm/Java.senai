package Javalist9;
import java.util.Scanner;
public class For12 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int menor = Integer.MAX_VALUE;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = entrada.nextInt();

                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("O menor número é: " + menor);

            entrada.close();
        }
    }

