package hot100;

public class test24 {
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(ints);
        }
    }

    public static void setZeroes(int[][] matrix) {
        //使用记录模式，遍历原矩阵如果是0则标记为true
        //若是行或列是true则变为0
        //行数
        int m=matrix.length;
        //列数
        int n=matrix[0].length;
        //再定义一个boolean的数组把行和列分别拆开记录
        //分别对应行和列有0的记录
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        //遍历矩阵标记0的位置
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0){
                    row[i]=col[j]=true;
                }
            }
        }

        //然后再遍历矩阵把对应标记的行和列变成0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
