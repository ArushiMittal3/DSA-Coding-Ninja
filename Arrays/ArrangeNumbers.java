// //Arrange Numbers in Array

// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
// Note:
// You need not print the array. You only need to populate it.
// Input Format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first and the only line of each test case or query contains an integer 'N'.
// Output Format :
// For each test case, print the elements of the arra/listy separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^4

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 6
// Sample Output 1 :
// 1 3 5 6 4 2
// Sample Input 2 :
// 2
// 9
// 3
// Sample Output 2 :
// 1 3 5 7 9 8 6 4 2
// 1 3 2

import java.util.Scanner;

public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }


        for(int i=0;i<n;i++){
            int arr1[]=new int[arr[i]];
            // int k=0;

            // my solution
            // for(int j=0;j<=arr[i]/2;j++){
            //     arr1[j]=++k;
            //     if(j==arr[i]/2){
            //         break;
            //     }
            //     arr1[arr[i]-j-1]=++k;
            // }

            //proper soltution 
            
            int left=0;
            int right=arr[i]-1;
            int c=1;
            while(left<=right){
                if(c%2==1){
                    arr1[left]=c;
                    left++;
                    c++;
                }else{
                    arr1[right]=c;
                    right--;
                    c++;
                }
            }

            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[j]);
            }

            System.out.println();
        }
        scan.close();
    }
}
