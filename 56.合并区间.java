/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
import java.util.*;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        // 按左端点升序排序
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    swap(intervals[i], intervals[j]);
                }
            }
        }
        
        List<int[]> ans = new ArrayList<>();
        // 先把第一个区间加入结果
        ans.add(new int[]{intervals[0][0], intervals[0][1]});
        
        for (int i = 1; i < intervals.length; i++) {
            // 获取结果中的最后一个区间
            int[] last = ans.get(ans.size() - 1);
            
            // 如果当前区间的左端点 <= 最后一个区间的右端点，说明有重叠
            if (intervals[i][0] <= last[1]) {
                // 更新右端点为两者的最大值
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                // 没有重叠，直接添加新区间
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
    
    private void swap(int[] intervals1, int[] intervals2) {
        int temp0 = intervals1[0];
        int temp1 = intervals1[1];
        intervals1[0] = intervals2[0];
        intervals1[1] = intervals2[1];
        intervals2[0] = temp0;
        intervals2[1] = temp1;
    }
}
// @lc code=end

