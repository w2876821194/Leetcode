//package f1;
//
//public class L6914 {
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class klausur.L深信服.Solution {
//    public ListNode doubleIt(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode listNode = new ListNode(1);
//        int dfs = dfs(listNode, head);
//        if (dfs == 1) {
//            return listNode;
//        }
//        return listNode.next;
//    }
//
//    public int dfs(ListNode newlistNode, ListNode listNode) {
//        if (listNode == null) {
//            return 0;
//        }
//        newlistNode.next = new ListNode(listNode.val * 2);
//        int dfs = dfs(newlistNode.next , listNode.next);
//        newlistNode.next.val += dfs;
//        if (newlistNode.next.val > 9) {
//            newlistNode.next.val %= 10;
//            return 1;
//        }
//        return 0;
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(8);
//        head.next.next = new ListNode(9);
//        new klausur.L深信服.Solution().doubleIt(head);
//    }
//}
