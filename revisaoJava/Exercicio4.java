package revisaoJava;
import java.util.Scanner;
public class Exercicio4 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a idade do nadador: ");
            int idade = entrada.nextInt();

            if (idade >= 5 && idade <= 7) {
                System.out.println("Categoria: Infantil");
            }
            else if (idade >= 8 && idade <= 17) {
                System.out.println("Categoria: Juvenil");
            }
            else if (idade >= 18) {
                System.out.println("Categoria: Sênior");
            }
            else {
                System.out.println("Idade fora das categorias.");
            }

            entrada.close();
        }
    }


