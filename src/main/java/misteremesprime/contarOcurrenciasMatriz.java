package misteremesprime;

public class contarOcurrenciasMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 2},
                {4, 2, 5, 6},
                {7, 8, 2, 9}
        };

        int numeroBuscado = 2;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    contador++;
                }
            }
        }

        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces.");
    }

}
