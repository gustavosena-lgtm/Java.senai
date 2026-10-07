package revisaoJava;
import java.util.Scanner;
public class Exercicio13 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número de 4 dígitos: ");
            int numero = entrada.nextInt();

            if (numero >= 1000 && numero <= 9999) {

                int primeiros = numero / 100;
                int ultimos = numero % 100;

                int soma = primeiros + ultimos;
                int resultado = soma * soma;

                if (resultado == numero) {
                    System.out.println("O número é mágico!");
                } else {
                    System.out.println("O número não é mágico.");
                }

            } else {
                System.out.println("Digite um número com 4 dígitos.");
            }

            entrada.close();
        }
    }


