package javaList6;
import java.util.Scanner;
public class While16 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a base: ");
            double base = sc.nextDouble();

            System.out.print("Digite o expoente: ");
            int expoente = sc.nextInt();

            double resultado = 1;
            int contador = 0;

            while (contador < expoente) {
                resultado = resultado * base;
                contador++;
            }

            System.out.println("Resultado: " + resultado);

            sc.close();
        }
    }

