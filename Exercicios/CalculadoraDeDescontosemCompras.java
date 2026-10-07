package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraDeDescontosemCompras {

        public static void main(String[] args) {
            // Define o local para aceitar ponto ou vírgula conforme o padrão regional
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite o valor total da compra (R$): ");
            double valorTotal = scanner.nextDouble();

            double percentualDesconto = 0;

            // Regras para definição da porcentagem de desconto
            if (valorTotal <= 200.00) {
                percentualDesconto = 0.05; // 5%
            } else if (valorTotal <= 500.00) {
                percentualDesconto = 0.10; // 10%
            } else {
                percentualDesconto = 0.15; // 15%
            }

            // Cálculos
            double valorDesconto = valorTotal * percentualDesconto;
            double valorFinal = valorTotal - valorDesconto;

            // Exibição dos resultados
            System.out.println("\n--- Resultado ---");
            System.out.printf("Valor da compra: R$ %.2f%n", valorTotal);
            System.out.printf("Desconto de %.0f%% aplicado: R$ %.2f%n", (percentualDesconto * 100), valorDesconto);
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);

            scanner.close();
        }
    }