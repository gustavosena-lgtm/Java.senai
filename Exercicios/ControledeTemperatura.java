package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class ControledeTemperatura {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite a temperatura atual (°C): ");
            double temperatura = scanner.nextDouble();

            String acaoRecomendada;

            // Estrutura condicional para determinar a ação
            if (temperatura < 18.0) {
                acaoRecomendada = "Ligar o aquecedor";
            } else if (temperatura <= 25.0) {
                acaoRecomendada = "Manter a temperatura atual";
            } else {
                acaoRecomendada = "Ligar o ar condicionado";
            }

            // Exibição dos resultados
            System.out.println("\n--- Controle de Temperatura ---");
            System.out.printf("Temperatura: %.1f°C%n", temperatura);
            System.out.println("Ação recomendada: \"" + acaoRecomendada + "\"");

            scanner.close();
        }
    }
