package javaList5;

public class While6 {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;

        while (numero <= 10) {
            soma = soma + numero;
            numero++;
        }

        System.out.println("A soma de 1 a 10 é: " + soma);
    }
}

