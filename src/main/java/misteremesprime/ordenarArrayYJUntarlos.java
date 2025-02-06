/*package puntosClave;

import java.util.Arrays;

public class ordenarArrayYJUntarlos {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 5, 6};

        int[] array3 = new int[array1.length + array2.length];

        // Copiar array1 en array3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Copiar array2 en array3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // Ordenar el array combinado con el método del rey de la montaña
        ordenarArrayConReyDeLaMontana(array3);

        // Eliminar duplicados del array
        //array3 = eliminarDuplicados(array3);

        // Mostrar el resultado
        System.out.println("Array combinado:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }

    public static void ordenarArrayConReyDeLaMontana(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Si el elemento en la posición i es mayor que el de la posición j, intercambiamos
                if (array[i] > array[j]) {
                    // Intercambiar los elementos
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

 */


