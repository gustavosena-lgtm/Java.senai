package javalist7;
import java.util.Scanner;
public class While20 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double valor;
            double total = 0;

            System.out.print("Digite o valor do produto (0 para finalizar): ");
            valor = entrada.nextDouble();

            while (valor != 0) {
                total += valor;

                System.out.print("Digite outro valor (0 para finalizar): ");
                valor = entrada.nextDouble();
            }

            double valorFinal = total;

            if (total > 500) {
                valorFinal = total * 0.90;
            }

            System.out.println("Total da compra: R$ " + total);

            if (total > 500) {
                System.out.println("Desconto de 10% aplicado!");
            }

            System.out.println("Valor final: R$ " + valorFinal);

            entrada.close();
        }
    }

