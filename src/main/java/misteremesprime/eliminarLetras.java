/*package puntosClave;

public class eliminarLetras {
    public static void main(String[] args) {

        // Opcion con StringBuilder -----------------------------------------------------------------------------------
        String input = "12345eeee"; // Cadena de entrada
        StringBuilder soloNumeros = new StringBuilder();

        // Recorrer la cadena y agregar solo los caracteres numéricos
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                soloNumeros.append(c);
            }
        }

        // Convertir el resultado a un entero (si hay números)
        if (soloNumeros.length() > 0) {
            int numero = Integer.parseInt(soloNumeros.toString());
            System.out.println("Número resultante: " + numero);
        } else {
            System.out.println("No se encontraron números en la cadena.");
        }

        // Opcion con replaceAll --------------------------------------------------------------------------------------

        String input = "12345eeee"; // Cadena de entrada

        // Usar expresión regular para eliminar todo lo que no sea un número
        String soloNumeros = input.replaceAll("[^0-9]", "");

        // Convertir la cadena resultante a un número entero
        if (!soloNumeros.isEmpty()) {
            int numero = Integer.parseInt(soloNumeros);
            System.out.println("Número resultante: " + numero);
        } else {
            System.out.println("No se encontraron números en la cadena.");
        }

        // Opcion con potencia y bucle del reves ----------------------------------------------------------------------

        public static void main(String[] args) {
            int resultado=0;
            for(String valor:args)
                resultado+=calculaEntero(valor);
            System.out.println(resultado);
        }

        private static int calculaEntero(String s){
            int potencia=1;
            int resultado=0;
            for (int i=s.length()-1;i>=0;i--){
                char c=s.charAt(i);
                if (Character.isDigit(c)){
                    int valor=Character.getNumericValue(c);
                    resultado+=valor*potencia;
                    potencia*=10;
                }
            }
            return resultado;
        }
    }

}

 */
