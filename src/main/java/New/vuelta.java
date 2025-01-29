package New;

public class vuelta {
    static int mat [][]={
            {2,3,5,4,0},
            {1,4,6,7,8},
            {1,3,3,6,0}
    };
    public static void main(String[] args) {
    vuelta();
    }
    private static void vuelta(){
        for (int i=0;i<5;i++){
            for(int j=0;j<3;j++){
               // mat[i][j]=mat[j][i];
                if(mat[j][i]==0){
                    System.out.print("||");
                }
                else
                System.out.print("|"+mat[j][i]);
            }
            System.out.println("|");
        }
    }
}
