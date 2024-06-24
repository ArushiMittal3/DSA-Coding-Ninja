package patterns;
public class CharPattern3 {
    public static void main(String[] args) {
        int n=4;
        for(int i='A'; i<'A'+n;i++){
            int k=0+i;
            for(int j='A';j<=i;j++){
                System.out.print((char)k);
                k++;
            }
            System.err.println();
        }
    }
}
