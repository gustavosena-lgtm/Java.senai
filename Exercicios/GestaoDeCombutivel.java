package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class GestaoDeCombutivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a distância da viagem (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo médio do veículo (km/l): ");
        double consumoMedio = scanner.nextDouble();

        // Cálculo da quantidade de combustível
        double combustivelNecessario = distancia / consumoMedio;

        // Exibição dos resultados no formato do exemplo
        System.out.println("\nDistância: " + (int) distancia + " km");
        System.out.println("Consumo médio: " + (int) consumoMedio + " km");
        System.out.printf("Quantidade de combustível necessária: %.0f litros%n", combustivelNecessario);

        scanner.close();
    }
}