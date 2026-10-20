package Javalist9;

public class For16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(a);

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}

