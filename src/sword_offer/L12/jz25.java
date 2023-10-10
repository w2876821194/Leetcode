//package sword_offer.L12;
//
//public class jz25 {
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
//    ListNode listNode = new ListNode(1);
//    ListNode root = listNode;
//
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        listNode.next = new ListNode(1);
//        recursion(l1, l2);
//        return root.next.next;
//    }
//
//    public void recursion(ListNode l1, ListNode l2) {
//        listNode = listNode.next;
//        if (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                listNode.next = l1;
//                recursion(l1.next, l2);
//            } else {
//                listNode.next = l2;
//                recursion(l1, l2.next);
//            }
//        } else if (l1 != null) {
//            listNode.next = l1;
//            recursion(l1.next, null);
//        } else if (l2 != null) {
//            listNode.next = l2;
//            recursion(null, l2.next);
//        }
//    }
//}
