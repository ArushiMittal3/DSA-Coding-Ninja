// Spiral Print

// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
// a. First row(left to right)
// b. Last column(top to bottom)
// c. Last row(right to left)
// d. First column(bottom to top)
//  Mind that every element will be printed only once.
// Refer to the Image:
// Alt txt

// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

// Second line onwards, the next 'N' lines or rows represent the ith row values.

// Each of the ith row constitutes 'M' column values separated by a single space.
// Output format :
// For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// 0 <= M <= 10^3
// Time Limit: 1sec
// Sample Input 1:
// 1
// 4 4 
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16
// Sample Output 1:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
// Sample Input 2:
// 2
// 3 3 
// 1 2 3 
// 4 5 6 
// 7 8 9
// 3 1
// 10
// 20
// 30
// Sample Output 2:
// 1 2 3 6 9 8 7 4 5 
// 10 20 30 

import java.util.Scanner;

public class SpiralArray {
    static int[][] getInput(int rows, int column, int[][] arr, Scanner scan) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] arr = new int[rows][columns];

        getInput(rows, columns, arr, scan);

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = columns - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(arr[rowStart][col] + " ");
            }
            rowStart++;

            // Traverse down
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(arr[row][colEnd] + " ");
            }
            colEnd--;

            // Traverse left, if there are rows remaining
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    System.out.print(arr[rowEnd][col] + " ");
                }
                rowEnd--;
            }

            // Traverse up, if there are columns remaining
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(arr[row][colStart] + " ");
                }
                colStart++;
            }
         
        }

        scan.close();
    }

}
