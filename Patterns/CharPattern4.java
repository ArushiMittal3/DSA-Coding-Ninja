package patterns;


public class CharPattern4 {
    public static void main(String[] args) {
        int n=7;
        for(int i='A'+n; i>'A';i--){
            int k=0+i;
            for(int j='A'+n; j>i;j--){
                System.out.print((char)k);
                k++;
            }
            System.err.println();
        }
    }
}
