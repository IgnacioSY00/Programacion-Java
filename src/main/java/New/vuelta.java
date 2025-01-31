package New;

public class vuelta {
    static int mat [][]={
            {2,3,5,4},
            {1,4,6,7,8},
            {1,3,3,6}
    };
    static int mat2 [][]=new int[3][5];
    public static void main(String[] args) {
    rellena();
    pinta();
    System.out.println("--------------");
    pintaRev();
    }
    private static void rellena(){
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat2[i][j]=mat[i][j];
            }
        }
    }
    private static void pinta(){
        for (int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                if(mat2[i][j]==0){
                    System.out.print("|"+" ");
                }
                else{
                System.out.print("|"+mat[i][j]);
                }
            }
            System.out.println("|");
        }
    }
    private static void pintaRev(){
        for (int i=0;i<mat2[0].length;i++){
            for(int j=0;j<mat2.length;j++){
                if(mat2[j][i]==0){
                    System.out.print("|"+" ");
                }
                else
                    System.out.print("|"+mat2[j][i]);
            }
            System.out.println("|");
        }
    }
}