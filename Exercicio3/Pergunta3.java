import java.util.InputMismatchException;
import java.util.Scanner;

public class Pergunta3 {
    public static void main(String[] args) {
        // try-with-resources garante fechamento do scanner
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("== Divisão de dois números ==");

            int x = lerInteiro(teclado, "Informe o penúltimo numero do seu celular: ");
            int y = lerInteiroNaoZero(teclado, "Informe o ultimo digito do seu celular (não pode ser 0): ");

            // Faz divisão em double para evitar truncamento inteiro
            double r = (double) x / y;
            System.out.println("O resultado da divisão é " + r);
        } catch (Exception e) {
            // captura qualquer exceção inesperada para não quebrar o programa
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Lê um inteiro, repetindo até que o usuário forneça um valor válido
    private static int lerInteiro(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // descarta token inválido
            }
        }
    }

    // Lê um inteiro e garante que não seja zero (para usar como divisor)
    private static int lerInteiroNaoZero(Scanner scanner, String prompt) {
        while (true) {
            int val = lerInteiro(scanner, prompt);
            if (val == 0) {
                System.out.println("O divisor não pode ser zero. Tente novamente.");
            } else {
                return val;
            }
        }
    }
}
