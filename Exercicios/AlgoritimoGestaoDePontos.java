package Exercicios;

import java.util.Scanner;

public class AlgoritimoGestaoDePontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das vitórias de cada jogador
        System.out.print("Digite o número de vitórias do Jogador 1: ");
        int vitoriasJogador1 = scanner.nextInt();

        System.out.print("Digite o número de vitórias do Jogador 2: ");
        int vitoriasJogador2 = scanner.nextInt();

        // Regra de pontuação: Jogador 1 ganha 10 pontos por vitória; Jogador 2 ganha 5
        int pontuacaoJogador1 = vitoriasJogador1 * 10;
        int pontuacaoJogador2 = vitoriasJogador2 * 5;

        // Exibição dos resultados no formato solicitado
        System.out.println("\nVitórias do jogador 1: " + vitoriasJogador1);
        System.out.println("Vitórias do jogador 2: " + vitoriasJogador2);
        System.out.println("Pontuação do jogador 1: " + pontuacaoJogador1 + " pontos");
        System.out.println("Pontuação do jogador 2: " + pontuacaoJogador2 + " pontos");

        scanner.close();
    }
}