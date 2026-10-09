package javalist7;
import java.util.Scanner;
public class While18 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int maioresQue50 = 0;
            int menoresQue20 = 0;
            int contador = 1;

            while (contador <= 10) {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                if (numero > 50) {
                    maioresQue50++;
                }

                if (numero < 20) {
                    menoresQue20++;
                }

                contador++;
            }

            System.out.println("Números maiores que 50: " + maioresQue50);
            System.out.println("Números menores que 20: " + menoresQue20);

            sc.close();
        }
    }

