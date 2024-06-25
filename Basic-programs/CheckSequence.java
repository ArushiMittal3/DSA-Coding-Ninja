import java.util.Scanner;

public class CheckSequence {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        String s="YES";
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            if(arr[0]<arr[1]){
                int j=i+1;
                if(arr[i]>=arr[j]){
                    s="NO";
                    break;
                }
            
            }else if(arr[0]>arr[1]){
                int j=i+1;
                if(arr[i]<=arr[j]){
                    s="NO";
                    break;
                }
                
            }
        }
        System.out.println(s);
        scan.close();
    }
}
