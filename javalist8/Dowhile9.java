package javalist8;
import java.util.Scanner;
public class Dowhile9 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int secreto = 42;
            int palpite;

            do {
                System.out.print("Digite seu palpite: ");
                palpite = sc.nextInt();

                if (palpite % 2 == 0) {
                    System.out.println("Seu palpite é par.");
                } else {
                    System.out.println("Seu palpite é ímpar.");
                }

                if (palpite > secreto) {
                    System.out.println("O número secreto é menor!");
                } else if (palpite < secreto) {
                    System.out.println("O número secreto é maior!");
                } else {
                    System.out.println("Parabéns! Você acertou!");
                }

            } while (palpite != secreto);

            sc.close();
        }
    }

