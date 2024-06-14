import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            int n1=scan.nextInt();

            int arr[]=new int[n1];
           for(int j=0;j<n1;j++){
                arr[j]=scan.nextInt();
           }

           for(int j=0;j<n1;j++){
            if(j==n1-1){
                break;
            }
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            j++;

            
       }

       for(int j=0;j<n1;j++){
        System.out.print(arr[j] + " ");
   }
        }
        System.out.println();
        scan.close();
    }
}
