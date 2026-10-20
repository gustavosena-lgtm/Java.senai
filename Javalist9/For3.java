package Javalist9;
import java.util.Scanner;
public class For3 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número N: ");
            int n = entrada.nextInt();

            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }

            entrada.close();
        }
    }

