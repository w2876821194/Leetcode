package sword_offer.L02;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    ListNode root;
    ListNode listNode;

    public ListNode reverseList(ListNode head) {
        reverse(head);
        root.next = null;
        return listNode.next;
    }

    public void reverse(ListNode root) {
        if (root == null) {
            this.root = new ListNode(0);
            this.listNode = this.root;
            return;
        }
        reverse(root.next);
        this.root.next = root;
        this.root = root;
    }
}
class Test {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        new Solution().reverseList(listNode);
    }
}
