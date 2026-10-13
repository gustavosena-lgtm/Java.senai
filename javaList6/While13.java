package javaList6;
import java.util.Scanner;
public class While13 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int contador = 1;
            int negativos = 0;

            while (contador <= 10) {
                System.out.print("Digite o " + contador + "º número: ");
                double numero = sc.nextDouble();

                if (numero < 0) {
                    negativos++;
                }

                contador++;
            }

            System.out.println("Quantidade de números negativos: " + negativos);

            sc.close();
        }
    }

