

public class BinToDeci {
    public static void main(String[] args) {
        int n=1010;

        int decimal=0; 
        int pow=1;
        while(n>0){
            int last=n%10;
            decimal+=last*pow;
            pow*=2;
            n/=10;
        }
        System.out.println(decimal);
    }
}
