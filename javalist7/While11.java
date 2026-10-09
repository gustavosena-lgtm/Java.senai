package javalist7;
import java.util.Scanner;
public class While11 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor inicial: ");
            double valor = sc.nextDouble();

            int repeticoes = 0;

            while (valor <= 1000) {
                valor = valor * 1.05;
                repeticoes++;
            }

            System.out.println("Valor final: R$ " + valor);
            System.out.println("Repetições necessárias: " + repeticoes);

            sc.close();
        }
    }

