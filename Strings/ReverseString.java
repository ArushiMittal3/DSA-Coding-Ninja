public class ReverseString {

    static String reverseString(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            str1+=str.charAt(str.length()-i-1);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="hello";

        System.out.println(reverseString(str));
    }
}
