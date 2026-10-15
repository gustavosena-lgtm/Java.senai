package javalist8;
import java.util.Scanner;
public class Dowhile2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número limite: ");
            int limite = sc.nextInt();

            int numero = 1;

            if (limite >= 1) {
                do {
                    if (numero % 3 == 0 || numero % 5 == 0) {
                        System.out.println(numero);
                    }

                    numero++;
                } while (numero <= limite);
            }

            sc.close();
        }
    }

