package javaList6;
import java.util.Scanner;
public class While15 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double preco = 0;
            double total = 0;

            while (preco >= 0) {
                System.out.print("Digite o preço do produto (negativo para parar): ");
                preco = sc.nextDouble();

                if (preco >= 0) {
                    total = total + preco;
                }
            }

            System.out.printf("Total da compra: R$ %.2f%n", total);

            sc.close();
        }
    }

