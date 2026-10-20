package Javalist9;
import java.util.Scanner;
public class For20 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int aprovados = 0;
            int reprovados = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                double nota = entrada.nextDouble();

                if (nota >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            System.out.println("Alunos aprovados: " + aprovados);
            System.out.println("Alunos reprovados: " + reprovados);

            entrada.close();
        }
    }

