package revisaoJava;
import java.util.Scanner;
public class Exercicio12 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o valor do produto: R$ ");
            double valor = entrada.nextDouble();

            System.out.println("1 - À vista (10% de desconto)");
            System.out.println("2 - Cartão (5% de desconto)");
            System.out.println("3 - 2x (preço normal)");

            System.out.print("Digite o código do pagamento: ");
            int codigo = entrada.nextInt();

            double valorFinal;

            switch (codigo) {
                case 1:
                    valorFinal = valor * 0.90;
                    break;

                case 2:
                    valorFinal = valor * 0.95;
                    break;

                case 3:
                    valorFinal = valor;
                    break;

                default:
                    System.out.println("Código inválido.");
                    entrada.close();
                    return;
            }

            System.out.printf("Valor final: R$ %.2f%n", valorFinal);

            entrada.close();
        }
    }

