import java.util.*;

public class Method1 {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        List<Integer> a = new ArrayList<>();
        while (cur != null) {
            a.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < a.size() / 2; i++) {
            if (a.get(i) != a.get(a.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
