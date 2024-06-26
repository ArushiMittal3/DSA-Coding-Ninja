package patterns;
// Code : Diamond of stars

// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5



// The dots represent spaces.



// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   * 
public class DiamondStars {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
          
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            for( int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
          
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
           
            for( int k=1;k<=(i-1)*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
