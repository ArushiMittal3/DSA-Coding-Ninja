
// Number of Digits

// Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.
// Input Format :
// Integer n
// Output Format :
// Count of digits
// Constraints :
// 1 <= n <= 10^6
// Sample Input 1 :
//  156
// Sample Output 1 :
// 3
// Sample Input 2 :
//  7
// Sample Output 2 :
// 1

public class noOfDigits {
   
    static int digits(int n){
        if(n==0){
            return 0;
        }
        int ans=digits(n/10);
        return ans+1;
    }

    public static void main(String[] args) {
        System.out.println(digits(123));
    }
}
