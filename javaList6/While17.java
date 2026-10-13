package javaList6;
import java.util.Scanner;
public class While17 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int fatorial = 1;
            int contador = 1;

            while (contador <= numero) {
                fatorial = fatorial * contador;
                contador++;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);

            sc.close();
        }
    }

