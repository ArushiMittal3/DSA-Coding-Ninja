public class Palindrome {
    

        static boolean palindrome(String str){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            String str="toyot";
    
            System.out.println(palindrome(str));
        }

    
}
