/*misteremesprime;

import java.util.Arrays;

public class combinarOrdenarEliminarRep {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3};
        int a2[] = {1, 1, 2, 3};

        int aF[] = fusionar(a1, a2);
        buscarRepetidos(aF);

        System.out.println(Arrays.toString(aF));
    }

    public static int[] fusionar(int a1[], int a2[]) {
        int aF[] = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            aF[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            aF[i] = a1[i];
        }
        return aF;
    }

    public static void buscarRepetidos(int aF[]) {
        for (int i = 0; i < aF.length; i++) {
            for (int j = 0; j < aF.length; j++) {
                if (aF[i] == aF[j]) {
                    aF[j] = -1;
                }
            }
        }
    }

    public static int contarDuplicados(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] reducirArray(int aF[]) {


    }

}

 */
