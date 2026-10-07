package revisaoJava;
import java.util.Scanner;
public class Exercicio8 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite seu peso em kg: ");
            double peso = entrada.nextDouble();

            System.out.print("Digite sua altura em metros: ");
            double altura = entrada.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("Seu IMC é: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso.");
            } else if (imc < 25) {
                System.out.println("Classificação: Peso ideal.");
            } else {
                System.out.println("Classificação: Acima do peso.");
            }

            entrada.close();
        }
    }

