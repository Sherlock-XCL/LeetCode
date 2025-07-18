/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
import java.util.*;
class Solution438{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        if (slen < plen) return ans;
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < plen; i ++) {
            sCount[s.charAt(i) - 'a'] ++;
            pCount[p.charAt(i) - 'a'] ++;
        }
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }
        // 滑动窗口右移
        for (int i = 0; i < slen - plen; i ++) {
            -- sCount[s.charAt(i) - 'a'];
            ++ sCount[s.charAt(i + plen) - 'a'];
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
// @lc code=end

