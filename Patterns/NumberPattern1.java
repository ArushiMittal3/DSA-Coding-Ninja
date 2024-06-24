package patterns;

public class NumberPattern1{
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n;i++){
            for(int j=i;j<2*i;j++){
                System.out.print(j + " ");
            }
            System.err.println();
        }
    }
}
