package Patterns;
public class CharPattern1 {
    
        public static void main(String[] args) {
            int n=4;
            for(int i='A'; i<'A'+n;i++){
                for(int j='A';j<=i;j++){
                    System.out.print((char)i);
                }
                System.err.println();
            }
        }
    }
    

