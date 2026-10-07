package Exercicios.pontos;

import java.util.Scanner;

public class GestaoPontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de vitórias do Jogador 1: ");
        int vitoriasJogador1 = scanner.nextInt();

        System.out.print("Digite o número de vitórias do Jogador 2: ");
        int vitoriasJogador2 = scanner.nextInt();

        // Cálculo da pontuação
        int pontosJogador1 = vitoriasJogador1 * 10;
        int pontosJogador2 = vitoriasJogador2 * 5;

        // Atribuição com operador ternário (no modelo da imagem)
        String resultado = (pontosJogador1 > pontosJogador2)
                ? "Jogador 1 venceu!"
                : (pontosJogador2 > pontosJogador1) ? "Jogador 2 venceu!" : "Empate!";

        // Exibição dos resultados
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Vitórias do Jogador 1: " + vitoriasJogador1 + " (" + pontosJogador1 + " pontos)");
        System.out.println("Vitórias do Jogador 2: " + vitoriasJogador2 + " (" + pontosJogador2 + " pontos)");
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}