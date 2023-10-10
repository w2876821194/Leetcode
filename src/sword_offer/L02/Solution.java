//package sword_offer.L02;
//
//
//import java.util.ArrayList;
//import java.util.List;
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
//    List<Integer> list = new ArrayList<>();
//    public int[] reversePrint(ListNode head) {
//        reverse(head);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public void reverse(ListNode root) {
//        if (root == null) {
//            return;
//        }
//        reverse(root.next);
//        list.add(root.val);
//    }
//}
