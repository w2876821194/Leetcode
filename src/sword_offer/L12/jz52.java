package sword_offer.L12;

import java.util.HashSet;
import java.util.Set;

public class jz52 {
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>();
        Set<ListNode> setB = new HashSet<>();
        while (headA != null || headB != null) {
            if (headA != null) {
                setA.add(headA);
                if (setB.contains(headA)) {
                    return headA;
                }
            }

            if (headB != null) {
                setB.add(headB);
                if (setA.contains(headB)) {
                    return headB;
                }
            }
            headA = headA != null ? headA.next : null;
            headB = headB != null ? headB.next : null;
        }
        return null;
    }
}

class Test {
    public static void main(String[] args) {
        ListNode listNodeA = new ListNode(4);
        listNodeA.next = new ListNode(1);
        listNodeA.next.next = new ListNode(8);
        ListNode listNodeB = new ListNode(5);
        listNodeB.next = new ListNode(0);
        listNodeB.next.next = new ListNode(1);
        listNodeB.next.next.next = listNodeA.next.next;

        new Solution().getIntersectionNode(listNodeA, listNodeB);
    }
}
