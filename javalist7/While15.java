package javalist7;
import java.util.Scanner;
public class While15 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();

            while (senha != 1234) {
                System.out.print("Senha incorreta! Tente novamente: ");
                senha = sc.nextInt();
            }

            System.out.println("Senha correta! Acesso permitido.");

            sc.close();
        }
    }

