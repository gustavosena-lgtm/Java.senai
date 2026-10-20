package Javalist9;
import java.util.Scanner;
public class For11 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int maior = Integer.MIN_VALUE;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = entrada.nextInt();

                if (numero > maior) {
                    maior = numero;
                }
            }

            System.out.println("O maior número é: " + maior);

            entrada.close();
        }
    }

