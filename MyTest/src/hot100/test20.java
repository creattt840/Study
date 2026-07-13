package hot100;

public class test20 {
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int pre=0;
        int max=nums[0];
        for (int num : nums) {
            pre=Math.max(pre+num,num);
            max=Math.max(max,pre);
        }
        return max;
    }
}
