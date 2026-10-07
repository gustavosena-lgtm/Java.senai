package revisaoJava;
import java.util.Scanner;

public class Exercicio1 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int num1 = entrada.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = entrada.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = entrada.nextInt();

            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);

            entrada.close();
        }
    }

