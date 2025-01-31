package New;

public class Max {
    public static void main(String[] args) {
        String s[] = new String[3];
        s[0] = "10";
        s[1] = "soy";
        s[2] = "nacho";
       int k=3;
      String f = Integer.toString(k);

       System.out.println(k);
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (j == 0)
                    System.out.print((s[i].charAt(j) + "").toUpperCase());
                else
                    System.out.print(s[i].charAt(j));
            }
            System.out.print(" ");
        }

    }
}