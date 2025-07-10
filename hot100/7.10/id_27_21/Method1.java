import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Method1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> ans = new ArrayList<>();
        // l1 = [1, 2, 3]
        // l2 = [2, 3, 4]
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ans.add(list1.val);
                list1 = list1.next;
            } else {
                ans.add(list2.val);
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            ans.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            ans.add(list2.val);
            list2 = list2.next;
        }
        
        // 创建虚拟头节点
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : ans) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}
