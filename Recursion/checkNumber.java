// Check Number in Array

// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// 'true' or 'false'
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 10
// 8
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 9 8 10
// 2
// Sample Output 2 :
// false

public class checkNumber {
    static boolean check(int[] n, int length, int target){
        if(length<1){
            return false;
        }
        if(n[length-1]==target){
            return true;
        };
        return check(n,length-1,target);
        
        
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(check(arr, arr.length, 7));
    }
}
