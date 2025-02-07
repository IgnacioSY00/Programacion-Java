package misteremesprime;

public class sumaMatrices {

    public static void main(String[] args) {
        // Definición de dos matrices de 3x3
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        // Validación: ambas matrices deben tener el mismo tamaño
        if (filas != matrizB.length || columnas != matrizB[0].length) {
            System.out.println("Las matrices no tienen las mismas dimensiones.");
            return;
        }

        // Matriz para almacenar el resultado
        int[][] suma = new int[filas][columnas];

        // Sumar elemento a elemento
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Imprimir resultado
        System.out.println("Suma de matrices:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
