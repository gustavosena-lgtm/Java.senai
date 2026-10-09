package javalist7;
import java.util.Scanner;
public class While12 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número maior que 1: ");
            double numero = sc.nextDouble();

            int divisoes = 0;

            while (numero > 1) {
                numero = numero / 2;
                divisoes++;
            }

            System.out.println("Quantidade de divisões: " + divisoes);
            System.out.println("Valor final: " + numero);

            sc.close();
        }
    }

