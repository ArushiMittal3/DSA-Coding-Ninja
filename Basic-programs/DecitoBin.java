
public class DecitoBin {
    public static void main(String[] args) {
        int n=10;

        int binary=0; 
        int pow=1;
        while(n>0){
            int last=n%2;
            binary+=last*pow;
            pow*=10;
            n/=2;
        }
        System.out.println(binary);
    }
}
