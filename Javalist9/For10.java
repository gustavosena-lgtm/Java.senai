package Javalist9;
import java.util.Scanner;
public class For10 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double soma = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = entrada.nextDouble();

                soma += numero;
            }

            double media = soma / 5;

            System.out.println("A média é: " + media);

            entrada.close();
        }
    }

