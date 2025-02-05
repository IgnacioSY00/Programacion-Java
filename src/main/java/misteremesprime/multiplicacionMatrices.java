package puntosClave;

public class multiplicacionMatrices {

    public static void main(String[] args) {
        // Matriz A (2x3)
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Matriz B (3x2)
        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int filasA = A.length;
        int columnasA = A[0].length;
        int filasB = B.length;
        int columnasB = B[0].length;

        // Validar compatibilidad
        if (columnasA != filasB) {
            System.out.println("No se puede multiplicar, dimensiones incompatibles.");
            return;
        }

        // Matriz resultante (2x2)
        int[][] resultado = new int[filasA][columnasB];

        // Realizar la multiplicación
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir resultado
        System.out.println("Resultado de la multiplicación:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
