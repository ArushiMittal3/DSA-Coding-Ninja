package patterns;
// Code : Inverted Number Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 55555 
// 4444
// 333
// 22
// 1
// Sample Input 2:
// 6
// Sample Output 2:
// 666666
// 55555 
// 4444
// 333
// 22
// 1


// =-------------------------------------------------------------------------------

public class InvertedNumberPattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}

