package hot100;

import java.util.ArrayList;
import java.util.List;

public class test25 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> integers;
        integers=spiralOrder(matrix);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        //创建一个集合来接收顺时针螺旋顺序的元素
        List<Integer> orders = new ArrayList<>();
        //如果为空数组直接返回
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return orders;
        }
        //先拿到一共多少行
        int rows=matrix.length;
        //再拿到一共有多少列
        int cols=matrix[0].length;
        //拿到总共有多少个元素
        int total=rows*cols;
        //再定义起始位置
        int row=0;
        int col=0;
        //定义一个同等大小的数组来记录当前元素是否被遍历
        boolean[][] visited=new boolean[rows][cols];
        //定义四个方向
        //{0,1}向右 {1,0}向下 {0,-1}向左 {-1,0}向上
        int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
        //初始方向索引为0
        int directionIndex=0;
        //对整个矩阵进行遍历
        for (int i = 0; i < total; i++) {
            orders.add(matrix[row][col]);
            visited[row][col]=true;
            int nextrow=row+direction[directionIndex][0];
            int nextcol=col+direction[directionIndex][1];
            if (nextrow<0||nextrow>=rows||nextcol<0||nextcol>=cols||visited[nextrow][nextcol]){
                directionIndex=(directionIndex+1)%4;
            }
            row+=direction[directionIndex][0];
            col+=direction[directionIndex][1];
        }
        return orders;
    }
}
