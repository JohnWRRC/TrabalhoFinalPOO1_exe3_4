
public class Pergunta4Matriz {

    /**
     * Recebe três "matrizes" double de tamanho 3x1 (ou seja double[3][1]),
     * calcula a - b e armazena o resultado em c.
     *
     * Lança IllegalArgumentException se qualquer matriz for null ou não tiver dimensão 3x1.
     */
    public static void subtrair(double[][] a, double[][] b, double[][] c) {
        // valida null
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Nenhuma matriz pode ser null.");
        }

        // valida dimensão 3x1
        if (!is3x1(a) || !is3x1(b) || !is3x1(c)) {
            throw new IllegalArgumentException("Todas as matrizes devem ter dimensão 3x1 (double[3][1]).");
        }

        for (int i = 0; i < 3; i++) {
            c[i][0] = a[i][0] - b[i][0];
        }
    }

    // helper para checar se matriz tem 3 linhas e 1 coluna
    private static boolean is3x1(double[][] m) {
        if (m.length != 3) return false;
        for (int i = 0; i < 3; i++) {
            if (m[i] == null || m[i].length != 1) return false;
        }
        return true;
    }

    // imprime matriz 3x1 de forma legível
    private static String matrizToString(double[][] m) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < m.length; i++) {
            sb.append(m[i][0]);
            if (i < m.length - 1) sb.append(", ");
        }
        sb.append("] (3x1)");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Exemplo usando matrizes 3x1
        double[][] a = { {5.0},{10.5}, {4.3}}; // 3x1
        double[][] b = { {2.0}, {3.5}, {1.3}  }; // 3x1
        double[][] c = { {0.0}, {0.0}, {0.0}  }; // resultado (3x1)

        try {
            subtrair(a, b, c);
            System.out.println("Matriz a: " + matrizToString(a));
            System.out.println("Matriz b: " + matrizToString(b));
            System.out.println("Resultado c (a - b): " + matrizToString(c));
        } catch (IllegalArgumentException iae) {
            System.err.println("Erro: " + iae.getMessage());
        }
    }
}
