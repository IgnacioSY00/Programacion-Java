package New;

public class EJ_8 {
    static final int MIN =4;
    static final int MAX =5;
   static int Tablero [][]=new int[MIN][MIN];
    static int Resultado [][]=new int[MAX][MAX];
    public static void main(String[] args) {
        rellena(MIN);
        imprime();
        sumafil();
        sumacol();
        imprime();

    }
    private static void imprime(){
        for (int i = 0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                System.out.print("|"+Resultado[i][j]);
            }
        System.out.println("|");
        }
    }
    private static void rellena(int MIN){
        for (int i = 0;i<MIN;i++)
            for(int j=0;j<MIN;j++)
                Resultado[i][j]=random(3);
    }
    private static void sumafil(){
        for (int i = 0;i<MAX;i++){
            int so=0;
            for(int j=0;j<MAX;j++){
                so+=Resultado[i][j];
            }
            Resultado[i][MIN]=so;

        }
    }
    private static void sumacol(){
        for (int i = 0;i<MIN;i++){
            int so=0;
            for(int j=0;j<MIN;j++){
                so+=Resultado[j][i];

            }
            Resultado[MIN][i]=so;
        }
    }
    private static int random(int n){
        int M=1;
        int N=n*n;
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }
}
