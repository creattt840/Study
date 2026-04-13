package hot100;

import java.util.HashSet;
import java.util.Set;

public class test6 {
    public static void main(String[] args) {
        String s="qrsvbspk";
        int max=lengthOfLongestSubstring(s);
        System.out.println(max);
    }

    public static int lengthOfLongestSubstring(String s) {
        //将字符串s转化为字符数组
        char[] ss=s.toCharArray();
        //使用set容器进行动态存储并且去重
        Set<Character> set=new HashSet<>();
        //设置默认返回值
        int res=0;
        //进行遍历
        for (int l = 0,r=0; r < s.length(); r++) {
            //拿出右指针指向的字符
            char ch=ss[r];
            //如果容器中包含此个ch
            //则表示左右指针相撞，此时左指针右边移动,然后再判断重合的是否出去，没出去就继续移动
            //或者右指针的字符与其中的相同此时set容器会自动去重
            while(set.contains(ch)){
                //此时左指针存储的值弹出
                set.remove(ss[l]);
                l++;
            }
            //如果没有重复的就把右指针的值放入容器
            set.add(ss[r]);
            res=Math.max(res,set.size());
        }
        return res;
    }
}
