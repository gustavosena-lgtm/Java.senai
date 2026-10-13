package javaList6;

public class While18 {
    public static void main(String[] args) {
        double cidadeA = 1000;
        double cidadeB = 1500;
        int anos = 0;

        while (cidadeA <= cidadeB) {
            cidadeA = cidadeA + (cidadeA * 0.02);
            cidadeB = cidadeB + (cidadeB * 0.01);
            anos++;
        }

        System.out.println("A cidade A passará a cidade B em " + anos + " anos.");
        System.out.printf("População de A: %.0f%n", cidadeA);
        System.out.printf("População de B: %.0f%n", cidadeB);
    }
}

