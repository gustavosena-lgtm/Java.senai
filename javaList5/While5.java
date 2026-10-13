package javaList5;
import java.util.Scanner;
public class While5 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número limite: ");
            int limite = sc.nextInt();

            int numero = 0;

            while (numero <= limite) {
                System.out.println(numero);
                numero += 5;
            }

            sc.close();
        }
    }

