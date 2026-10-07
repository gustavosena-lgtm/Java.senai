package revisaoJava;
import java.util.Scanner;

public class Exercicio5 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero >= 100 && numero <= 200) {
                System.out.println("O número está entre 100 e 200.");
            } else if (numero < 100) {
                System.out.println("O número é menor que o intervalo.");
            } else {
                System.out.println("O número é maior que o intervalo.");
            }

            entrada.close();
        }
    }

