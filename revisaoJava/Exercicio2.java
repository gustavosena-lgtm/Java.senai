package revisaoJava;
import java.util.Scanner;
public class Exercicio2 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o primeiro lado: ");
            double lado1 = entrada.nextDouble();

            System.out.print("Digite o segundo lado: ");
            double lado2 = entrada.nextDouble();

            System.out.print("Digite o terceiro lado: ");
            double lado3 = entrada.nextDouble();

            if (lado1 < lado2 + lado3 &&
                    lado2 < lado1 + lado3 &&
                    lado3 < lado1 + lado2) {

                System.out.println("Os lados podem formar um triângulo.");
            } else {
                System.out.println("Os lados não podem formar um triângulo.");
            }

            entrada.close();
        }
    }

