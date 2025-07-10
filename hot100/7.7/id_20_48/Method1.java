import java.util.*;

public class Method1 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i ++) {
            int ansj = n - 1 - i;
            for (int j = 0; j < n; j ++) {
                ans[j][ansj] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i ++) {
            matrix[i] = Arrays.copyOf(ans[i], n);
        }
    }
}
