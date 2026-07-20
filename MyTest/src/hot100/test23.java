package hot100;

public class test23 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] answer=productExceptSelf(nums);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int length=nums.length;
        //先计算answer[i]左边的所有乘积
        //索引'0'的元素左侧没有元素，所以answer[0]=1
        answer[0]=1;
        //此时计算的是除i之外左侧的乘积
        for (int i = 1; i < length; i++) {
            answer[i]=answer[i-1]*nums[i-1];
        }
        //再把右侧的乘积算进去
        //刚开始右侧没有元素R=1
        int R=1;
        for (int i = length-1; i >=0 ; i--) {
            //在索引i都是要乘右侧乘积
            answer[i]=answer[i]*R;
            //计算右侧乘积
            R*=nums[i];
        }
        return answer;
    }
}
