package revisaoJava;
import java.util.Scanner;

public class Exercicio6 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double num1 = entrada.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = entrada.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = entrada.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;

                default:
                    System.out.println("Operação inválida.");
            }

            entrada.close();
        }
    }

