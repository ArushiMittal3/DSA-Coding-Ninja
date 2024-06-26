// First Index of Number

// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1

public class firstIndex {
    static int index(int[] n, int length, int target){
        if(length==n.length-1){
            return -1;
        }
        if(n[length]==target){
            return length;
        };
        return index(n,length+1,target);
        
        
    }

    public static void main(String[] args) {
        int[] arr={9, 8 ,10, 8};
        System.out.println(index(arr, 0, 8));
    }
}
