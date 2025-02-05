package New;

public class suma {
    static int f =3;
    static int c =rancol(9,1);
    static int irr [][]=new int[f][c];
    static int irr2 [][]=new int[f][c];
    public static void main(String[] args) {
    rellena(irr);
    rellena(irr2);
    imprime(irr);
    imprime(irr2);
    suma(irr,irr2);
    }
    private static int rancol(int N, int M){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }
    private static void rellena(int ir[][]){
        for (int i =0;i<ir.length;i++){
            for (int j =0;j<ir[i].length;j++){
                ir[i][j]=rancol(9,1);
            }
        }
    }
    private static void imprime(int ir[][]){
        for (int i =0;i<ir.length;i++){
            for (int j =0;j<ir[i].length;j++){
                System.out.print("|"+ir[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }
    private static void suma(int ir[][],int ir2[][]){
        int a = 0;
        int b = 0;
        for (int i =0;i<ir.length;i++){
            for (int j =0;j<ir[i].length;j++){
                a=ir[i][j]+ir2[i][j];
                b+=a;
            }
        }
        System.out.println("La suma de las matrices es:"+b);
    }
}