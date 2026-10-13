package javaList6;
import java.util.Scanner;
public class While12 {


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();

            while (!senha.equals("1234")) {
                System.out.println("Senha Incorreta, tente novamente");
                System.out.print("Digite a senha: ");
                senha = entrada.nextLine();
            }

            System.out.println("Senha correta! Acesso permitido.");

            entrada.close();
        }
    }

