import java.util.*;

// 暴力 超时 但语法整体有进步
public class Method1 {
    public String minWindow(String s, String t) {
        int tCount[] = new int[58];
        for (int i = 0; i < t.length(); i ++) {
            tCount[t.charAt(i) - 'A'] ++;
        }
        int tempT[] = new int[58];
        int min = 100005; 
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i ++) {
            tempT = Arrays.copyOf(tCount, 58);;
            StringBuilder ss = new StringBuilder();
            int cnt = t.length();
            int j;
            for (j = i; j < s.length(); j ++) {
                ss.append(s.charAt(j));
                if(tempT[s.charAt(j) - 'A'] > 0) {
                    tempT[s.charAt(j) - 'A'] --;
                    cnt --;
                    if (cnt == 0) {
                        break;
                    }
                }
            }
            if (cnt == 0 && j - i + 1 < min) {
                min = j - i + 1;
                ans = ss;
            }
        }
        return ans.toString();
    }
}
