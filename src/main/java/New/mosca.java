package New;

public class mosca {
    static int mosca[] = new int[8];
    public static void main(String[] args) {
        mosca[random(0,7)]=1;

    }
    private static int random(int M, int N){
        return (int) (Math.floor(Math.random()*(N-M+1)+M));
    }
}
