import java.util.Scanner;
import java.util.Locale;

public class FundamentosDeEletricidade {

    public static void main(String[] args) {
        // Configura o Scanner para aceitar ponto decimal (ex: 127.0)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=====================================================");
        System.out.println("===== SISTEMA DE DIMENSIONAMENTO ELÉTRICO SENAI =====");
        System.out.println("=====================================================");

        // 1. Entrada de Dados pelo Usuário
        System.out.print("> Informe o nome do equipamento: ");
        String nomeEquipamento = scanner.nextLine();

        System.out.print("> Informe a potência elétrica (Watts): ");
        double potencia = scanner.nextDouble();

        System.out.print("> Tensão da rede (127 ou 220 Volts): ");
        double tensao = scanner.nextDouble();

        // 2. Cálculo da Corrente Elétrica (I = P / V)
        double corrente = potencia / tensao;

        // 3. Seleção da Bitola Mínima (base na tabela fornecida)
        String bitola;
        if (corrente <= 15.5) {
            bitola = "1.5 mm²";
        } else if (corrente <= 21.0) {
            bitola = "2.5 mm²";
        } else if (corrente <= 28.0) {
            bitola = "4.0 mm²";
        } else if (corrente <= 36.0) {
            bitola = "6.0 mm²";
        } else if (corrente <= 50.0) {
            bitola = "10.0 mm²";
        } else {
            bitola = "16.0 mm² ou superior";
        }

        // 4. Exibição da Saída Esperada no Console
        System.out.println("\n=============== RESULTADO DO CÁLCULO ===============");
        System.out.printf("Equipamento:                %s%n", nomeEquipamento);
        System.out.printf("Potência Registrada:        %.0f W%n", potencia);
        System.out.printf("Tensão da Rede:             %.0f V%n", tensao);
        System.out.printf("Corrente Elétrica Calculada: %.2f A%n", corrente);
        System.out.printf("Bitola Mínima do Condutor:  %s%n", bitola);
        System.out.println("====================================================");

        scanner.close();
    }
}