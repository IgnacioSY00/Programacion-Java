package puntosClave;

public class diagonalesMatrices {

    public static void main(String[] args) {
        // Matriz cuadrada de 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matriz.length;

        // Validar que la matriz es cuadrada
        if (n != matriz[0].length) {
            System.out.println("La matriz no es cuadrada.");
            return;
        }

        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];               // Diagonal principal
            sumaSecundaria += matriz[i][n - 1 - i];        // Diagonal secundaria
        }

        System.out.println("Suma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
    }


}
