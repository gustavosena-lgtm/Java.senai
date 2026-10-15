package javalist8;

public class Dowhile7 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do {
            if (numero % 3 == 0 || numero % 5 == 0) {
                soma += numero;
            }

            numero++;
        } while (numero <= 100);

        System.out.println("Soma total: " + soma);
    }
}

