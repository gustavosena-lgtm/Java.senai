package javalist8;
import java.util.Scanner;
public class Dowhile8 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            int ultimoDigito;
            int contador = 1;

            do {
                System.out.print("Digite o " + contador + "º número: ");
                numero = sc.nextInt();

                ultimoDigito = Math.abs(numero) % 10;

                if (ultimoDigito == 0) {
                    System.out.println("Classificação: termina em 0.");
                } else if (ultimoDigito == 5) {
                    System.out.println("Classificação: termina em 5.");
                } else {
                    System.out.println("Classificação: termina em outro valor.");
                }

                contador++;
            } while (contador <= 10);

            sc.close();
        }
    }

