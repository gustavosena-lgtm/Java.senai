package Javalist9;
import java.util.Scanner;
public class For15 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int contador = 0;

            for (int i = 1; i <= 8; i++) {
                System.out.print("Digite o " + i + "º número: ");
                int numero = entrada.nextInt();

                if (numero > 50) {
                    contador++;
                }
            }

            System.out.println("Quantidade de números maiores que 50: " + contador);

            entrada.close();
        }
    }

