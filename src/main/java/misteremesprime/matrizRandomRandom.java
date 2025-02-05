package puntosClave;

import java.util.Arrays;

public class matrizRandomRandom {
    private final static int N=3;                       //Constante de filas
    public static void main(String[] args) {                //Esqueleto del programa:
        int [][] matriz=creaMatriz(N);                      //      <--Inicializo matriz
        System.out.println(Arrays.deepToString(matriz));    //      <--Print de matriz rellena
        System.out.println(sumaMatriz(matriz));             //      <--Print de la suma de la matriz
    }

    private static int[][] creaMatriz(int n){               //Funcion que crea el array de arrays vacio
        int[][] aux=new int[N][];
        for (int i=0;i<aux.length;i++){                     //Bucle que crea el array en cada hueco del array principal (columna)
            aux[i]=new int[aleatorio(3,12)];        //con la funcion random "aleatorio"
            for (int j=0;j<aux[i].length;j++)                   //Bucle interno que rellena el array con numeros aleatorios 1-9
                aux[i][j]=aleatorio(1,9);
        }
        return aux;
    }

    private static int sumaMatriz(int[][] matriz){          //Funcion que suma todos los valores de la matriz
        int resultado=0;
        for(int[] array:matriz)
            for (int valor:array)
                resultado+=valor;
        return resultado;
    }

    private static int aleatorio(int M,int N){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }
}
