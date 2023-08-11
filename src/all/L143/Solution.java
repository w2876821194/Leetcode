package all.L143;


import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode root = head;
        while (root != null) {
            list.add(root);
            root = root.next;
        }
        int size = list.size();
        ListNode node = new ListNode();
        ListNode listNode = node;
        for (int i = 0; i < size / 2; i++) {
            node.next = list.get(i);
            node.next.next = list.get(size - i - 1);
            node = node.next.next;
        }
        if (size % 2 != 0) {
            node.next = list.get(size / 2);
            node = node.next;
        }
        node.next = null;
        head = listNode.next;
    }
}

class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new Solution().reorderList(head);
    }
}
