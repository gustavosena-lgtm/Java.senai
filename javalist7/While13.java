package javalist7;
import java.util.Scanner;
public class While13 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;
            int soma = 0;

            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            while (numero != 0) {
                soma += numero;
                quantidade++;

                System.out.print("Digite outro número (0 para parar): ");
                numero = sc.nextInt();
            }

            System.out.println("Quantidade de números digitados: " + quantidade);
            System.out.println("Soma total: " + soma);

            if (quantidade > 0) {
                double media = (double) soma / quantidade;
                System.out.println("Média: " + media);
            } else {
                System.out.println("Nenhum número foi digitado.");
            }

            sc.close();
        }
    }

