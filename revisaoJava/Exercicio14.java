package revisaoJava;
import java.util.Scanner;
public class Exercicio14 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o salário: R$ ");
            double salario = entrada.nextDouble();

            double imposto;

            if (salario <= 2000) {
                imposto = 0;
            } else if (salario <= 5000) {
                imposto = salario * 0.10;
            } else {
                imposto = salario * 0.20;
            }

            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Salário após imposto: R$ %.2f%n", salario - imposto);

            entrada.close();
        }
    }

