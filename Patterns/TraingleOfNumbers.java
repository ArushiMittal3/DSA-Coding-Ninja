package patterns;

// Code : Triangle of Numbers

// Print the following pattern for the given number of rows.
// Pattern for N = 4



// The dots represent spaces.



// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//          232
//        34543
//      4567654
//    567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//          232
//        34543
//      4567654

public class TraingleOfNumbers {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=i;j<=2*n-i;j++){
                System.out.print(" ");
            }

            for( k=i;k<2*i;k++){
                System.out.print(k);
            }

            for(int j=k-2;j>=i;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
