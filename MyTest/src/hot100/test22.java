package hot100;

public class test22 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        int[] nums1=new int[k];
        int[] nums2=new int[nums.length-k];
        for (int i = nums.length-k,j=0; i < nums.length; i++,j++) {
            nums1[j]=nums[i];
        }
        for (int i = 0; i < nums.length-k; i++) {
            nums2[i]=nums[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[nums1.length+i]=nums2[i];
        }
    }
}
