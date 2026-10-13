package javaList6;
import java.util.Scanner;
public class While14 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero = -1;

            while (numero != 0) {
                System.out.print("Digite um número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Programa encerrado!");

            sc.close();
        }
    }

