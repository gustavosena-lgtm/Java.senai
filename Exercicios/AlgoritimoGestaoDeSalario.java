package Exercicios;

import java.util.Scanner;

public class AlgoritimoGestaoDeSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto (R$): ");
        double salarioBruto = scanner.nextDouble();

        // Cálculo do imposto de 10%
        double imposto = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - imposto;

        // Exibição dos resultados no formato exato da questão
        System.out.println();
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto de 10%%: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
