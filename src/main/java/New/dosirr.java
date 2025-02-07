package New;

public class dosirr {
    static int irr [][] = new int[rancol(1,9)][rancol(1,9)];
    static int irr2 [][] = new int[rancol(1,9)][rancol(1,9)];
    public static void main(String[] args) {
        rellena(irr);
        rellena(irr2);
        int total =suma(irr) + suma(irr2);
        System.out.println("El total es:"+ total);
        imprime(irr);
        imprime(irr2);
    }
    private static int rancol(int M, int N){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }

    private static void rellena (int ir[][]){
        for (int i =0;i<ir.length;i++){
            for (int j =0;j<ir[i].length;j++){
                ir[i][j]=rancol(1,9);
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

    private static int suma (int ir[][]){
        int a=0;
        int b =0;
        for (int i =0;i<ir.length;i++){
            for (int j =0;j<ir[i].length;j++){
                a=ir[i][j];
                b+=a;
            }
        }
        return b;
    }

}
