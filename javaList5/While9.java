package javaList5;

public class While9 {
    public static void main(String[] args) {
        int numero = 2;
        int soma = 0;

        while (numero <= 50) {
            soma = soma + numero;
            numero += 2;
        }

        System.out.println("A soma dos números pares de 1 a 50 é: " + soma);
    }
}

