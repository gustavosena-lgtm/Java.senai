package javaList5;
import java.util.Scanner;
public class While8 {


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            int contador = 1;
            double soma = 0;

            while (contador <= 5) {
                System.out.print("Digite a nota " + contador + ": ");
                double nota = sc.nextDouble();

                soma = soma + nota;
                contador++;
            }

            double media = soma / 5;

            System.out.printf("A média das notas é: %.2f%n", media);

            sc.close();
        }
    }

