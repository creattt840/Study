package hot100;

public class test3 {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,2};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        while(right!=n){
            if(nums[right]!=0){
                //此时右指针指向不是0应该把非0的数字换到前面取
                swap(nums,left,right);
                //此时因为交换过后所以此时前面已经是非0的数字左指针需要右移
                left++;
            }
            //右指针向右移执行未处理的节点，
            //如果此时右指针指向是0不交换，如果是0就跳过
            right++;
        }
    }

    public static void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
