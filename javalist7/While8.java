package javalist7;
import java.util.Scanner;
public class While8 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero % 5 == 0) {
                    quantidade++;
                }

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de múltiplos de 5: " + quantidade);

            sc.close();
        }
    }