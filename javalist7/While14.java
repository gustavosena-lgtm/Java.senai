package javalist7;
import java.util.Scanner;
public class While14 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite uma nota entre 0 e 10: ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite novamente: ");
                nota = sc.nextDouble();
            }

            System.out.println("Nota válida: " + nota);

            sc.close();
        }
    }

