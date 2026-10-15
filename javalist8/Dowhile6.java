package javalist8;
import java.util.Scanner;
public class Dowhile6 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int divisor = 2;
            boolean primo = true;

            if (numero < 2) {
                primo = false;
            } else {
                do {
                    if (numero % divisor == 0 && numero != divisor) {
                        primo = false;
                    }
                    divisor++;
                } while (divisor < numero && primo);
            }

            if (primo) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }

            sc.close();
        }
    }

