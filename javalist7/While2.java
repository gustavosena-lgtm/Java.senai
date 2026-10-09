package javalist7;
import java.util.Scanner;
public class While2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero > 10) {
                    quantidade++;
                }

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de números maiores que 10: " + quantidade);

            sc.close();
        }
    }

