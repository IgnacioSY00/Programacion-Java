package New;

import java.util.Scanner;

public class ll {
    static int n=3;
    static int ni=0;
    static int np=0;
    static int total [][]=new int[n][n];

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        rellena(sc);
        sc.close();
        imprime();
        tamm();
        int par[][]=new int[np][];
        int inpar[][]=new int[ni][];
        impar(par,inpar);
        imprimepar(par);
        imprimeinpar(inpar);
    }
    private static void rellena(Scanner sc){
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.println("Introduzca valor en:"+i+","+j);
                total[i][j]=sc.nextInt();
            }
        }
    }
    private static void imprime(){
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print("|"+total[i][j]);
            }
            System.out.println("|");
        }
    }
    private static void tamm(){
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(total[i][j] % 2 == 0){
                    np++;
                }
                else {
                    ni++;
                }
            }

        }
        System.out.println(np+"y"+ni);
    }
    private static void impar(int par[][], int inpar[][]){
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(total[i][j] % 2 == 0){
                    par[i][j]=total[i][j];
                }
                else {
                    inpar[i][j]=total[i][j];
                }
            }

        }
    }
    private static void imprimepar(int par[][]){
        System.out.println("pares");
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print("|"+par[i][j]);
            }
            System.out.println("|");
        }
    }
    private static void imprimeinpar(int inpar[][]){
        System.out.println("inpares");
        for (int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print("|"+inpar[i][j]);
            }
            System.out.println("|");
        }
    }

}
