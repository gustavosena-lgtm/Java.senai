package revisaoJava;
import java.util.Scanner;
public class Exercicio10 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a hora de início: ");
            int inicio = entrada.nextInt();

            System.out.print("Digite a hora de fim: ");
            int fim = entrada.nextInt();

            int duracao;

            if (fim >= inicio) {
                duracao = fim - inicio;
            } else {
                duracao = (24 - inicio) + fim;
            }

            System.out.println("Duração do jogo: " + duracao + " hora(s).");

            entrada.close();
        }
    }

