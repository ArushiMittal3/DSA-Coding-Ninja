import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArray {
    public  static int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;

        List<Integer> arr= new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if( nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
            
        }
        int[] result = new int[arr.size()];
         
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int [] nums2={2,2};

        int arr[]=intersect(nums1,nums2);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
