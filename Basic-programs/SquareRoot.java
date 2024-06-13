
public class SquareRoot {
    public static void main(String[] args) {
        int n=26;
        int output=1;
        while(output*output<=n){
            output++;
        }
        output--;
        System.out.println(output);
    }
}
