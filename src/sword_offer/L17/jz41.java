//package sword_offer.L17;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class jz41 {
//}
//
//class MedianFinder {
//
//    /**
//     * initialize your data structure here.
//     */
//    private List<Integer> list;
//    int left;
//    int right;
//
//    public MedianFinder() {
//        list = new ArrayList<>();
//    }
//
//    public void addNum(int num) {
//        if (list.size() == 0) {
//            left = 0;
//            right = 0;
//        } else {
//            if (left == right) {
//                right++;
//            } else {
//                left++;
//            }
//        }
//        list.add(num);
//        list.sort(Comparator.comparingInt(i -> i));
//    }
//
//    public double findMedian() {
//        if (list.size() > 0) {
//            return (list.get(left) + list.get(right)) / 2.0;
//        }
//        return 0;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        MedianFinder m = new MedianFinder();
//        m.addNum(6);
//        m.addNum(10);
//        m.addNum(2);
//        m.addNum(6);
//        m.addNum(5);
//        m.addNum(6);
//        m.findMedian();
//
//        //[],[6],[],[10],[],[2],[],[6],[],[5],[],[0],[],[6]
//        // 0 2 5 6 6 10
//    }
//}
