// Rotate array

// You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
//  Note:
// Change in the input array/list itself. You don't need to return or print the elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains the value of 'D' by which the array/list needs to be rotated.
// Output Format :
// For each test case, print the rotated array/list in a row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^4
// 0 <= N <= 10^6
// 0 <= D <= N
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7
// 2
// Sample Output 1:
// 3 4 5 6 7 1 2
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7
// 0
// 4
// 1 2 3 4
// 2
// Sample Output 2:
// 1 2 3 4 5 6 7
// 3 4 1 2

public class RotateArray {
   static  int[] rotateArray(int[] arr, int d){
        while(d>0){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
            System.out.println(i);
        }
        arr[arr.length-1]=temp;
        d--;
    
    }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = { 1,2,3,4,5,6,7 };

        int arr[] = rotateArray(nums1, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//BETTER SOL 
// class Solution {
//     public void rotate(int[] nums, int k) {
//         k%=nums.length;
//         reverse(nums, 0, nums.length-1);
//         reverse(nums, 0, k-1);
//         reverse(nums, k, nums.length-1);
//     }

//      public void reverse(int[] nums, int start, int end){
//         while(start < end){
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }