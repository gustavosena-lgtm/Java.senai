package javalist7;
import java.util.Scanner;
public class While17 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int soma = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero % 2 == 0) {
                    soma += numero;
                }

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Soma dos números pares: " + soma);

            sc.close();
        }
    }

