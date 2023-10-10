//package sword_offer.L11;
//
//public class jz22 {
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}
//
//class klausur.L深信服.Solution {
//    public ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode left = head;
//        ListNode right = head;
//
//        while (k-- > 0) {
//            right = right.next;
//        }
//        while (right != null) {
//            left = left.next;
//            right = right.next;
//        }
//        return left;
//    }
//}
