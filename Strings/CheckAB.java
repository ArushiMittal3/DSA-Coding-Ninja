// Check AB

// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.
// Input format :
// String S
// Output format :
// 'true' or 'false'
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// abb
// Sample Output 1 :
// true
// Sample Input 2 :
// abababa
// Sample Output 2 :
// false

public class CheckAB {
    static boolean check(String str){
        if( str==""){
            return true;
        }
        if( str.charAt(0)!='a'){
            return false;
        }

        if(str.substring(1)==""){
            return true;
        }

        if(str.charAt(1)!='b' && str.charAt(2)!='b'){
            return false;
        }

        return check(str.substring(3));

        
    }
    public static void main(String[] args) {
        System.out.println(check("abba"));
    }
}
