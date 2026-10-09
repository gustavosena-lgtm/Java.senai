package javalist7;
import java.util.Scanner;
public class While1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o limite: ");
            int limite = sc.nextInt();

            int soma = 0;
            int numero = 0;

            while (soma <= limite) {
                System.out.print("Digite um número: ");
                numero = sc.nextInt();

                soma = soma + numero;
            }

            System.out.println("Soma total: " + soma);

            sc.close();
        }
    }

