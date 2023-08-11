package all.L2;


// Definition for singly-linked list.
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
    ListNode listNode = new ListNode(0);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        dfs(l1, l2, listNode, false);
        return listNode.next;
    }

    public void dfs(ListNode listNode1, ListNode listNode2, ListNode listNode, boolean flag) {
        boolean flag1 = listNode1 == null;
        boolean flag2 = listNode2 == null;
        if (flag1 && flag2 && !flag) {
            return;
        }
        int num = (!flag1 ? listNode1.val : 0) + (!flag2 ? listNode2.val : 0) + (flag ? 1 : 0);
        listNode.next = new ListNode(num % 10);
        dfs(flag1 ? null : listNode1.next, flag2 ? null : listNode2.next, listNode.next, num >= 10);
    }
}

class Test {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        Solution solution = new Solution();
        solution.addTwoNumbers(listNode1, listNode2);
    }
}
