public class Method1 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];
        // 遍历 matrix
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] == 0) {
                    changeToZero(ans, i, j, m, n);
                }
            }
        }
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (ans[i][j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    private void changeToZero(int[][] ans, int row, int col, int m, int n) {
        // 这个元素的列 置0
        for (int i = 0; i < m; i ++) {
            ans[i][col] = 1;
        }
        // 这个元素的行 置0
        for (int j = 0; j < n; j ++) {
            ans[row][j] = 1;
        }
    }
}