public class MergeSortedArrays2 {
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
       int j=n-1;
       int k=m+n-1;

       while(i>=0 && j>=0){
           if(nums1[i]>nums2[j]){
               nums1[k]=nums1[i];
               i--;
           }else{
               nums1[k]=nums2[j];
               j--;
           }
           k--;
       }

       while(i>=0){
           nums1[k]=nums1[i];
           k--;
           i--;
       }

       while(j>=0){
           nums1[k]=nums1[j];
           j--;
           k--;
       }

       return nums1;
   }

   public static void main(String[] args) {
    int[] nums1 = { 0};
    int[] nums2 = { 1};
    
    int arr[] = merge(nums1,0 ,nums2,1);

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
