package javalist8;
import java.util.Scanner;
public class Dowhile4 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int pares = 0;
            int impares = 0;
            int contador = 1;

            do {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                contador++;

            } while (contador <= 12);

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);

            sc.close();
        }
    }

