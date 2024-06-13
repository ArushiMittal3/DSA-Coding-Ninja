package patterns;

public class IsocelesTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            for( k=1;k<=i;k++){
                System.out.print(k);
            }

            for(int j=k-2;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

