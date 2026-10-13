package javaList6;
import java.util.Scanner;
public class While19 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade = 1;
            int soma = 0;
            int quantidade = 0;

            while (idade != 0) {
                System.out.print("Digite uma idade (0 para parar): ");
                idade = sc.nextInt();

                if (idade != 0) {
                    soma = soma + idade;
                    quantidade++;
                }
            }

            if (quantidade > 0) {
                double media = (double) soma / quantidade;
                System.out.printf("A média de idade é: %.2f%n", media);
            } else {
                System.out.println("Nenhuma idade foi informada.");
            }

            sc.close();
        }
    }

