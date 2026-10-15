package javalist8;
import java.util.Scanner;
public class Dowhile1 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int contador = 1;

            do {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }

                contador++;

            } while (contador <= 20);

            sc.close();
        }
    }

