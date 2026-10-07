package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class AlgoritimoGestaoEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a nota das provas: ");
        double notaProvas = scanner.nextDouble();

        System.out.print("Digite a nota das atividades: ");
        double notaAtividades = scanner.nextDouble();

        // Cálculo da média ponderada (Provas: peso 70% | Atividades: peso 30%)
        double mediaFinal = (notaProvas * 0.70) + (notaAtividades * 0.30);

        // Verificação da situação do aluno
        String situacao = (mediaFinal >= 6.0) ? "Aprovado" : "Reprovado";

        // Exibição dos resultados
        System.out.println("\n--- Resultado Final ---");
        System.out.printf("Nota das provas: %.1f%n", notaProvas);
        System.out.printf("Nota das atividades: %.1f%n", notaAtividades);
        System.out.printf("Média Final: %.2f%n", mediaFinal);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
