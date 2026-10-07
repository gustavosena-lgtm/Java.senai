package revisaoJava;
import java.util.Scanner;
public class Exercicio3 {


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

                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triângulo Equilátero.");
                }
                else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triângulo Isósceles.");
                }
                else {
                    System.out.println("Triângulo Escaleno.");
                }

            } else {
                System.out.println("Os lados não formam um triângulo.");
            }

            entrada.close();
        }
    }

