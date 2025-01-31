package New;

import java.util.Scanner;

public class sumar {
    private static final  int MAX = 3;
    private static int respuesta [][] = new int [MAX][MAX];

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        rellena();
        if(comprueba(respuesta)==false)
            System.out.println("No es correcto");
        else
            System.out.println("Es correctísimo");
    }

   /* private static void relleno(Scanner sc, int[][] respuesta){


        for(int i =0;i<MAX;i++){
            for(int j =0;j<MAX;j++){
                System.out.println("Introduzca valor en:"+i+","+j);
                int res =sc.nextInt();
                respuesta[i][j]=res;
                pintaTablero();
            }

        }
    }*/

    private static void pintaTablero(){
        for(int k =0;k<MAX;k++){
            for(int l =0;l<MAX;l++){
                System.out.print("|"+respuesta[k][l]);

            }
            System.out.println("|");
        }
    }

    private static boolean comprueba(int [][] respuesta){
        boolean estanTodos []= new boolean[MAX*MAX];
        for(int i =0;i<respuesta.length;i++)
            for(int j =0;j<respuesta[i].length;j++){
                int valor=respuesta[i][j];
                if(valor==0)return false;
                estanTodos[valor -1]=true;
            }
        for(int i = 0;i<MAX*MAX;i++)
            if(!estanTodos[i])return false;
        return true;
    }

    private static void rellena(){
        boolean obtenidos []= new boolean[MAX*MAX];
        for(int i =0;i<MAX;i++){
            for(int j =0;j<MAX;j++){
                System.out.println("Introduzca valor en:"+i+","+j);
                int valor;
                do{
                    valor=random(MAX);
                }
                while (obtenidos[valor-1]);
                obtenidos[valor-1]=true;
                respuesta[i][j]=valor;
                pintaTablero();
            }

        }
    }

    private static int random(int n){
        int i=1;
        int j=n*n;
        return(int)(Math.floor(Math.random()*(j-i+1)+i));
    }
}
