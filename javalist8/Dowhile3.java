package javalist8;
import java.util.Scanner;
public class Dowhile3 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;
            int contador = 1;

            do {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                if (numero % 4 == 0) {
                    quantidade++;
                }

                contador++;
            } while (contador <= 15);

            System.out.println("Quantidade de múltiplos de 4: " + quantidade);

            sc.close();
        }
    }

