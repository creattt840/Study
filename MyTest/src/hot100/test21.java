package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class test21 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length==0){
            //里面没有数组
            return new int[0][2];
        }

        //对内部数组进行排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        //创建一个集合来存储合并后的数组
        ArrayList<int[]> merged = new ArrayList<>();

        //对数组进行遍历
        for (int i = 0; i < intervals.length; i++) {
            //分别记录当前数组的左右数据
            int L=intervals[i][0];
            int R=intervals[i][1];
            //进行判断，是否是第一次合并并且上一次合并后的右边是否大于当前数组的左边
            if (merged.size()==0||merged.get(merged.size()-1)[1]<L){
                //添加进入合并数组
                merged.add(new int[]{L,R});
            }else{
                //否则表示最后一次合并右侧大于当前数组左侧，进行合并
                merged.get(merged.size()-1)[1]=Math.max(R,merged.get(merged.size()-1)[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
