package javalist7;
import java.util.Scanner;
public class While16 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero >= 10 && numero <= 50) {
                    quantidade++;
                }

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de números entre 10 e 50: " + quantidade);

            sc.close();
        }
    }

