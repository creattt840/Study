package hot100;

public class test4 {
    public static void main(String[] args) {
        int[] arr={1,1};
        int max=maxAreas(arr);
        System.out.println(max);
    }

    public static int maxArea(int[] height) {
        //如果该数组为空或者只有一个值，直接返回0
        if(height.length == 0||height.length==1){
            return 0;
        }

        //定义一个数值记录最大面积
        int max=0;

        for (int i = 0; i < height.length; i++) {
            //记录x轴的长度
            int x=0;
            //遍历后面的数据
            for (int j = i+1; j < height.length; j++) {
                //进入第一个值，此时x+1
                x++;
                //判断两头的索引的数值哪个小，哪个小就用哪个计算
                if(height[i]>height[j]){
                    //判断是否比最大值大
                    if(max<x*height[j]){
                        max=x*height[j];
                    }
                }else{
                    if(max<x*height[i]){
                        max=x*height[i];
                    }
                }
            }
        }

        return max;
    }


    public static int maxAreas(int[] height) {
        //利用双指针，一个从头开始，一个从尾开始
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            ans=Math.max(ans,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
