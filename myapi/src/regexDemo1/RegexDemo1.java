package regexDemo1;

public class RegexDemo1 {
    public static void main(String[] args) {
        /* 假如现在要求校验一个qq号码是否正确。
         1.要求必须是6位及20位之内
         2.0不能在开头
         3.必须全部是数字
         */

        //正则表达式的作用
        //作用一：校验字符串是否满足规则
        //作用二：在一段文本中查找满足要求的内容

        String qq="1234567890";

        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //校验用户名是否满足规则
        //校验密码是否满足规则
        //校验身份证是否满足规则
        //校验手机号是否满足规则
    }
}
