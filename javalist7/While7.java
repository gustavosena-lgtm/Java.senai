package javalist7;
import java.util.Scanner;
public class While7 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int soma = 0;
            int contador = 1;

            while (contador <= 8) {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                if (numero > 50) {
                    soma += numero;
                }

                contador++;
            }

            System.out.println("Soma dos números maiores que 50: " + soma);

            sc.close();
        }
    }

