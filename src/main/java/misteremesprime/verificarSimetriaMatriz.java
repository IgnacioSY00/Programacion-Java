package misteremesprime;

public class verificarSimetriaMatriz {

    public static void main(String[] args) {
        // Ejemplo de matriz simétrica de 3x3
        int[][] matriz = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int n = matriz.length;

        // Validar que la matriz es cuadrada
        for(int i=0;i<matriz.length;i++){
            if (n != matriz[i].length) {
                System.out.println("La matriz no es cuadrada.");
                return;
            }
        }

        boolean simetrica = true;
        for (int i = 0; i < n && simetrica; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }


}
