package puntosClave;

public class busquedaElementoMaximoYPosicion {

    public static void main(String[] args) {
        int[][] matriz = {
                {3, 5, 1},
                {7, 2, 9},
                {4, 6, 8}
        };

        int max = matriz[0][0];
        int filaMax = 0, columnaMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
        }

        System.out.println("El elemento máximo es " + max +
                " y se encuentra en la posición (" + filaMax + ", " + columnaMax + ").");
    }
}
