public class Method2 {
    public String minWindow(String s, String t) {
        int[] sCnt = new int[128];
        int[] tCnt = new int[128];
        int m = s.length();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (char tt : tChar) tCnt[tt] ++;
        int ansLeft = -1, ansRight = m;
        int left = 0;
        for (int right = 0; right < m; right ++) {
            sCnt[sChar[right]] ++;
            while (isCovered(tCnt, sCnt)) {
                if (right - left < ansRight - ansLeft) {
                    ansLeft = left;
                    ansRight = right;
                }
                sCnt[sChar[left]] --;
                left ++;
            }
        }
        return ansLeft < 0 ? "" : s.substring(ansLeft, ansRight + 1);
    }

    private boolean isCovered(int[] tCnt, int[] sCnt) {
        for (int i = 'A'; i <= 'Z'; i ++) {
            if (sCnt[i] < tCnt[i]) return false;
        }
        for (int i = 'a'; i <= 'z'; i ++) {
            if (sCnt[i] < tCnt[i]) return false;
        }
        return true;
    }
}
