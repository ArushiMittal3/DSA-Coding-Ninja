// Remove Consecutive Duplicates

// For a given string(str), remove all the consecutive duplicate characters.
// Example:
// Input String: "aaaa"
// Expected Output: "a"

// Input String: "aabbbcc"
// Expected Output: "abc"
//  Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
// Output Format:
// The only line of output prints the updated string.
// Note:
// You are not required to print anything. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// aabccbaa
// Sample Output 1:
// abcba
// Sample Input 2:
// xxyyzxx
// Sample Output 2:
// xyzx

public class removeDuplicates {
    static String removeDuplicate(String str){
        String ans="" + str.charAt(0);
        int k=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=ans.charAt(k)){
                ans+=str.charAt(i);
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("aabccbaa"));
    }
}
