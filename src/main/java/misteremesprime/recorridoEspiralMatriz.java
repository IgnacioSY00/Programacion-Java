package puntosClave;

public class recorridoEspiralMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int inicioFila = 0, inicioCol = 0;
        int finFila = filas - 1, finCol = columnas - 1;

        System.out.println("Recorrido en espiral:");
        while (inicioFila <= finFila && inicioCol <= finCol) {
            // Recorrer la fila superior de izquierda a derecha
            for (int j = inicioCol; j <= finCol; j++) {
                System.out.print(matriz[inicioFila][j] + " ");
            }
            inicioFila++;

            // Recorrer la columna derecha de arriba hacia abajo
            for (int i = inicioFila; i <= finFila; i++) {
                System.out.print(matriz[i][finCol] + " ");
            }
            finCol--;

            // Recorrer la fila inferior de derecha a izquierda (si aún existe)
            if (inicioFila <= finFila) {
                for (int j = finCol; j >= inicioCol; j--) {
                    System.out.print(matriz[finFila][j] + " ");
                }
                finFila--;
            }

            // Recorrer la columna izquierda de abajo hacia arriba (si aún existe)
            if (inicioCol <= finCol) {
                for (int i = finFila; i >= inicioFila; i--) {
                    System.out.print(matriz[i][inicioCol] + " ");
                }
                inicioCol++;
            }
        }
        System.out.println();
    }


}
