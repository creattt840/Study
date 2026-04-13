package hot100;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,9,5};
        int max=longestConsecutive(nums);
        System.out.println(max);
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int tmp=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1) {
                max+=1;
            }else{
                tmp=Math.max(max,tmp);
                max=1;
            }
        }
        return Math.max(max,tmp);
    }
}
