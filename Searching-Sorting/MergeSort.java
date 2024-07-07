public class MergeSort {
   static  void mergeSort(int arr[], int startingIndex, int lastIndex){
    if (startingIndex >= lastIndex) {
        return;
    }
        int mid=(startingIndex+lastIndex)/2;
        mergeSort(arr, startingIndex, mid);
        mergeSort(arr, mid+1, lastIndex);
        merge(arr,startingIndex,mid, lastIndex);
    }

    static void merge(int[] arr, int startingIndex,int mid, int lastIndex){
        int size=lastIndex-startingIndex+1;
        int out[]=new int[size];
        int i=startingIndex;
        int j=mid +1;
        int k=0;
        while(i<=mid && j<=lastIndex){
            if(arr[i]<arr[j]){
                out[k]=arr[i];
                i++;
                k++;
            }else{
                out[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            out[k]=arr[i];
            k++;
            i++;
        }

        while(j<=lastIndex){
            out[k]=arr[j];
            j++;
            i++;
        }

        for(int s=0 ;s<size;s++){
            arr[startingIndex+ s]=out[s];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 13, 4, 1, 3, 6, 28 };

         mergeSort(nums1, 0, nums1.length-1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
