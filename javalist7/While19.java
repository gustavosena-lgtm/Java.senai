package javalist7;
import java.util.Scanner;
public class While19 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;
            double soma = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                if (numero > 100) {
                    soma += numero;
                    quantidade++;
                }

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            if (quantidade > 0) {
                double media = soma / quantidade;
                System.out.println("Média dos números maiores que 100: " + media);
            } else {
                System.out.println("Nenhum número maior que 100 foi digitado.");
            }

            sc.close();
        }
    }

