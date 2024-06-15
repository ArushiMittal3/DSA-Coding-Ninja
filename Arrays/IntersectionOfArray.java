import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Array Intersection
// You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
// Note :
// Input arrays/lists can contain duplicate elements.
// The intersection elements printed would be in the order they appear in the first array/list(ARR1)
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
// First line of each test case or query contains an integer 'N' representing the size of the first array/list.
// Second line contains 'N' single space separated integers representing the elements of the first the array/list.
// Third line contains an integer 'M' representing the size of the second array/list.
// Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// For each test case, print the intersection elements in a row, separated by a single space.
// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// 0 <= M <= 10^5
// Time Limit: 1 sec 
// Sample Input 1 :
// 2
// 6
// 2 6 8 5 4 3
// 4
// 2 3 4 7 
// 2
// 10 10
// 1
// 10
// Sample Output 1 :
// 2 4 3
// 10
// Sample Input 2 :
// 1
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 2 1 2
// Explanation for Sample Output 2 :
// Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.

public class IntersectionOfArray {
    public  static int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;

        List<Integer> arr= new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if( nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
            
        }
        int[] result = new int[arr.size()];
         
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int [] nums2={2,2};

        int arr[]=intersect(nums1,nums2);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
