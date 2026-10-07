package revisaoJava;
import java.util.Scanner;
public class Exercicio15 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o dia de nascimento: ");
            int dia = entrada.nextInt();

            System.out.print("Digite o mês de nascimento: ");
            int mes = entrada.nextInt();

            if ((mes == 3 && dia >= 21) ||
                    (mes == 4 && dia <= 19)) {

                System.out.println("O signo é Áries.");
            } else {
                System.out.println("A pessoa não é do signo de Áries.");
            }

            entrada.close();
        }
    }

