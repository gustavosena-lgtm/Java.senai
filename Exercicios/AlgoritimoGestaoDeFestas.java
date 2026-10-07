package Exercicios;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlgoritimoGestaoDeFestas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Define o formato da data aceito (dia/mês/ano)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
            String dataNascimentoTexto = scanner.nextLine();

            // Converte o texto digitado para o objeto LocalDate
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoTexto, formatter);
            LocalDate dataAtual = LocalDate.now();

            // Calcula a diferença exata entre a data de nascimento e a data atual
            int idade = Period.between(dataNascimento, dataAtual).getYears();

            // Verifica a regra de maioridade
            boolean podeEntrar = idade >= 18;
            String entradaPermitida = podeEntrar ? "Sim" : "Não";

            // Exibição dos resultados
            System.out.println("\n--- Verificação de Entrada ---");
            System.out.println("Data de nascimento: " + dataNascimento.format(formatter));
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Entrada permitida: " + entradaPermitida);

            scanner.close();
        }
    }

