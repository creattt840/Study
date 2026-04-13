package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> list=threeSum(nums);
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.println(integer+",");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //先排序
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //元素去重
            if(i>0&&nums[i]==nums[i-1]) continue;
            //规定左指针和右指针
            int l=i+1;
            int r=nums.length-1;
            //设定要找的值
            int target=-nums[i];
            //遍历，此时i的位置不变要找nums[l]+nums[r]==-nums[i]
            while(l<r){
                if(target==nums[l]+nums[r]){
                    List<Integer> list=new ArrayList<>();
                    Collections.addAll(list,nums[i],nums[l],nums[r]);
                    lists.add(list);
                    //此时找到目标值，左右指针都要移动
                    //因为此时target与左右指针的值相等了
                    //如果只移动一边会导致左右指针相加的数值增加或减少，永远无法到达target，无意义所有一起移动
                    l++;
                    r--;
                    //为左右两边指针移动后去重，如果不去重返回集合会出现重复
                    while(l<r&&nums[l]==nums[l-1]) l++;
                    while(l<r&&nums[r]==nums[r+1]) r--;
                }else{
                    //此时与目标值不相等，进行判断
                    //如果左右指针的值相加小于目标值，证明应该有一个值要增大，所有左指针右移
                    if(nums[l]+nums[r]<target){
                        l++;
                    }else{
                        //否则就是右指针左移，使得相加值减少
                        r--;
                    }
                }
            }
        }
        return lists;
    }
}
