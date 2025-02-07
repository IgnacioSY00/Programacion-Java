package misteremesprime;

public class transposicionMatriz {

    public static void main(String[] args) {
        // Matriz original (2x3)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Matriz transpuesta (3x2)
        int[][] transpuesta = new int[columnas][filas];

        // Realizar la transposición
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Imprimir matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[0].length; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
