package javalist7;
import java.util.Scanner;
public class While4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int quantidade = 0;
            double soma = 0;

            System.out.print("Digite um número negativo para parar: ");
            numero = sc.nextInt();

            while (numero >= 0) {
                if (numero > 0) {
                    soma += numero;
                    quantidade++;
                }

                System.out.print("Digite outro número: ");
                numero = sc.nextInt();
            }

            if (quantidade > 0) {
                double media = soma / quantidade;
                System.out.println("Média dos números positivos: " + media);
            } else {
                System.out.println("Nenhum número positivo foi digitado.");
            }

            sc.close();
        }
    }

