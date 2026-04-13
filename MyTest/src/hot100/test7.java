package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> list = new ArrayList<>();
        list=findAnagrams(s,p);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        //定义两个值存储两个字符串的长度
        int slen=s.length();
        int plen=p.length();
        //先排除不可能情况，即s的长度小于p的长度
        if(slen<plen) return new ArrayList<>();

        //创建一个集合存储可能返回的索引
        List<Integer> list = new ArrayList<>();
        //以下的数组用来记录出现的字母
        //用ASCII码对应的26个字母作为索引，其索引对应的数值表示出现的次数
        //是否异位只要比较两个数组的数值
        int[] scount=new int[26];//此处用以滑动窗口记录长度为plen情况下是否异位的数组
        int[] pcount=new int[26];//此处用来记录p字符串中所有字母出现的次数
        //此处比较的是前plen个字符
        for (int i = 0; i < plen; i++) {
            //取出的char需要转化为数字索引
            //此时把前s和p中前plen个字符出现次数都做了统计
            scount[s.charAt(i)-'a']++;
            pcount[p.charAt(i)-'a']++;
        }

        //此时判断0索引的子串是否异位
        if(Arrays.equals(scount,pcount)){
            list.add(0);
        }

        //此处用以判断从1索引开始后面所有的子串是否异位
        //此时p字符串所有出现的字符已经被记录
        //此处不超过slen-plen是因为子串最长到slen-plen-1，因为如果超过slen-plen
        //这时候子串的长度小于plen
        for (int i = 0; i < slen-plen; i++) {
            //此时需要把0索引对应的字符次数归零，此时s左侧向右滑动
            //此时右边索引对应的字符出现次数增加，滑动窗口右侧向右滑动
            scount[s.charAt(i)-'a']--;
            scount[s.charAt(i+plen)-'a']++;
            //此时已经完成滑动
            //再次比对两个数组是否相等
            if(Arrays.equals(scount,pcount)){
                //因为0索引在循环外面进行了判断，此时循环次数少了一次，对应的索引应该为i+1
                list.add(i+1);
            }
        }
        return list;
    }
}
