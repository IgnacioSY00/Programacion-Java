package New;

import java.util.Scanner;

public class mosca {
    static int mosca[] = new int[8];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        mosca[random(0,7)]=1;
        System.out.println("Donde está la mooosca? Introduce valores de 0 a 7");
        int num = sc.nextInt();
        if(!comprueba(num))
            System.out.println("Has fallado intentalo otra vez");

        else{
            System.out.println("Muy bien, la mosca estaba en " + num);
        }
    }
    private static int random(int M, int N){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }
    private static boolean comprueba(int num){
        for(int i =0;i<mosca.length;i++){
            if(mosca[i]==1){
                if(i==num){
                    return true;
                }
                else return false;
            }
        }
        return false;
    }
}
