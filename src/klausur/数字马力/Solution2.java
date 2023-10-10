package klausur.数字马力;

import java.util.*;

public class Solution2 {
}


public class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @param val  int整型
     * @return ListNode类
     */
    public ListNode deleteNode(ListNode head, int val) {
        ListNode root = head;
        if (root.val == val) {
            return root.next;
        }

        while (root.next != null) {
            if (root.next.val == val) {
                root.next = root.next.next;
                break;
            }
            root = root.next;
        }
        return head;
    }
}
