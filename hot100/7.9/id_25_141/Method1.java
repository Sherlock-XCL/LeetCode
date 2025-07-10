import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Method1 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
           boolean isSuccess = seen.add(cur);
           if (!isSuccess) {
            return true;
           }
           cur = cur.next;
        }
        return false;
    }
}