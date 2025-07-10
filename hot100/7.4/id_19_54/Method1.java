import java.util.*;

public class Method1 {
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 左下右上
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>(m * n);
        int i = 0;
        int j = 0;
        int di = 0;
        for (int k = 0; k < m * n; k ++) {
            ans.add(matrix[i][j]);
            matrix[i][j] = Integer.MAX_VALUE;
            int x = i + DIRS[di][0];
            int y = j + DIRS[di][1]; // (x, y)表示下一步
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] == Integer.MAX_VALUE) {
                // 下一步到达边界条件 或 下一步的位置已经被遍历
                di = (di + 1) % 4; // 右转
            }
            // 更新 i，j
            i += DIRS[di][0];
            j += DIRS[di][1];

        }
        return ans;
    }
}
