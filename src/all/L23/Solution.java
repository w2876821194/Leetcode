package all.L23;

import java.util.*;

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int len = lists.length;
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(i -> i.val));
        ListNode root = new ListNode(0);
        ListNode node = root;

        Arrays.stream(lists).filter(Objects::nonNull).forEach(queue::offer);
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            node.next = poll;
            if (poll.next != null) {
                queue.offer(poll.next);
            }
            node = node.next;
        }
        return root.next;
    }
}
