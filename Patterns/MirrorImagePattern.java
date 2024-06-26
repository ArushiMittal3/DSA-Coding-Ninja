package patterns;


// Print the following pattern for the given N number of rows.
// Pattern for N = 4

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50

// Sample Input 1:
// 3
// Sample Output 1:
//       1 
//     12
//   123
// Sample Input 2:
// 4
// Sample Output 2:
//       1 
//     12
//   123
// 1234
// ------------------------------------------------------------------------

public class MirrorImagePattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
