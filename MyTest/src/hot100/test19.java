package hot100;

public class test19 {
    public static void main(String[] args) {
        int[] nums={0,0};
        int k=0;
        int count=subarraySum(nums,k);
        System.out.println(count);
    }

    public static int subarraySum(int[] nums, int k) {
        //记录子串数量
        int count=0;
        //进行循环遍历数组，从第k个开始然后往前遍历，这样可以涵盖子串末尾如果是0的情况
        for (int start=0;start<nums.length;start++){
            int sum=0;
            for (int end=start;end>=0;end--){
                sum+=nums[end];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
