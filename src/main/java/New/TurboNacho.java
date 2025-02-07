package New;

public class TurboNacho {
    public class JavaCommonMethods {
        public static void main(String[] args) {

            // Métodos de Integer
            System.out.println("Integer Methods:");
            // Convierte una cadena en un número entero
            int num = Integer.parseInt("123");
            System.out.println("parseInt: " + num);
            // Convierte un número en su representación binaria
            String binary = Integer.toBinaryString(10);
            System.out.println("toBinaryString: " + binary);
            // Obtiene el máximo de dos valores
            int maxVal = Integer.max(10, 20);
            System.out.println("max: " + maxVal);

            // Métodos de Character
            System.out.println("\nCharacter Methods:");
            char ch = 'A';
            // Verifica si el carácter es un dígito
            System.out.println("isDigit: " + Character.isDigit(ch));
            // Verifica si el carácter es una letra
            System.out.println("isLetter: " + Character.isLetter(ch));
            // Convierte el carácter a minúscula
            System.out.println("toLowerCase: " + Character.toLowerCase(ch));

            // Métodos de String
            System.out.println("\nString Methods:");
            String str = "Hello, World!";
            // Obtiene la longitud de la cadena
            System.out.println("length: " + str.length());
            // Obtiene el carácter en una posición específica
            System.out.println("charAt: " + str.charAt(0));
            // Obtiene una subcadena a partir de una posición
            System.out.println("substring: " + str.substring(7));
            // Reemplaza una palabra en la cadena
            System.out.println("replace: " + str.replace("World", "Java"));

            // Métodos de StringBuilder
            System.out.println("\nStringBuilder Methods:");
            StringBuilder sb = new StringBuilder("Hello");
            // Agrega una cadena al final
            sb.append(", Java");
            System.out.println("append: " + sb);
            // Inserta una cadena en una posición específica
            sb.insert(5, " Beautiful");
            System.out.println("insert: " + sb);
            // Elimina una parte de la cadena
            sb.delete(5, 14);
            System.out.println("delete: " + sb);
            // Invierte la cadena
            sb.reverse();
            System.out.println("reverse: " + sb);
        }
    }
}