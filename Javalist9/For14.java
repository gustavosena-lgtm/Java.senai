package Javalist9;
import java.util.Scanner;
public class For14 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double soma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = entrada.nextDouble();

                if (numero > 0) {
                    soma += numero;
                }
            }

            System.out.println("A soma dos números positivos é: " + soma);

            entrada.close();
        }
    }

