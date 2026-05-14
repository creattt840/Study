package hot100;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class test9 {
    public static void main(String[] args) {
        boolean valid = isValid("([])");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        //把括号以键值对方式放入好比对
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');
        //创建一个栈的结构
        //用Deque接口当栈使用
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            //取出第i个字符
            char ch=s.charAt(i);
            //进行比对是否是左边
            if (pairs.containsKey(ch)) {
                //如果是右边判断双向队列是否为空，以及是否有匹配的
                //peek()查看队头
                if(stack.isEmpty()||stack.peek()!=pairs.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
