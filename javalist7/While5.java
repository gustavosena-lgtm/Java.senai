package javalist7;
import java.util.Scanner;
public class While5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                System.out.println("Dobro: " + (numero * 2));

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            sc.close();
        }
    }

