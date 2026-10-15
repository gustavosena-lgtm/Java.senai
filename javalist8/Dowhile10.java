package javalist8;
import java.util.Scanner;
public class Dowhile10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor em centavos: ");
            int valor = sc.nextInt();

            int moedas25 = 0;
            int moedas10 = 0;
            int moedas5 = 0;
            int moedas1 = 0;

            if (valor >= 0) {
                do {
                    if (valor >= 25) {
                        moedas25++;
                        valor -= 25;
                    } else if (valor >= 10) {
                        moedas10++;
                        valor -= 10;
                    } else if (valor >= 5) {
                        moedas5++;
                        valor -= 5;
                    } else if (valor >= 1) {
                        moedas1++;
                        valor -= 1;
                    }
                } while (valor > 0);

                System.out.println("Moedas de 25 centavos: " + moedas25);
                System.out.println("Moedas de 10 centavos: " + moedas10);
                System.out.println("Moedas de 5 centavos: " + moedas5);
                System.out.println("Moedas de 1 centavo: " + moedas1);
            } else {
                System.out.println("Valor inválido! Digite um valor positivo.");
            }

            sc.close();
        }
    }

