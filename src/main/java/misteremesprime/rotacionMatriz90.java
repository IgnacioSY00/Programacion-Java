package misteremesprime;

public class rotacionMatriz90 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matriz.length;
        // Se creará una matriz auxiliar para almacenar la rotación
        int[][] rotada = new int[n][n];

        // Realizar la rotación: la columna i de la matriz original se convierte en la fila i de la rotada
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        // Imprimir matriz rotada
        System.out.println("Matriz rotada 90° en sentido horario:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotada[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
