package all.L21;

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
    ListNode listNode = new ListNode();
    ListNode root = listNode;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        sum(list1, list2);
        return root.next;
    }

    public void sum(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            listNode.next = null;
        } else if (list1 == null) {
            listNode.next = list2;
            listNode = listNode.next;
            sum(null, list2.next);
        } else if (list2 == null) {
            listNode.next = list1;
            listNode = listNode.next;
            sum(null, list1.next);
        } else {
            if (list1.val < list2.val) {
                listNode.next = list1;
                listNode = listNode.next;
                sum(list1.next, list2);
            } else {
                listNode.next = list2;
                listNode = listNode.next;
                sum(list1, list2.next);
            }
        }
    }
}
