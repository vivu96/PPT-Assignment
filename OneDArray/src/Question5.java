import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {0,0,0,4,5,6};
        int nums3[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            nums3[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            nums3[nums1.length - nums2.length +i] = nums2[i];
        }
        Arrays.sort(nums3);
        for(int i=0; i<nums3.length; i++){
            nums1[i] = nums3[i];
        }
//        for (int i = 0; i < nums3.length; i++) {
//            System.out.println(nums3[i]);
//        }
    }
}
