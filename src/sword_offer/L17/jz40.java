//package sword_offer.L17;
//
//import java.util.Arrays;
//import java.util.PriorityQueue;
//
//public class jz40 {
//}
//
//class klausur.L深信服.Solution {
//    public int[] getLeastNumbers(int[] arr, int k) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        Arrays.stream(arr).forEach(priorityQueue::add);
//        int[] array = new int[k];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = priorityQueue.poll();
//        }
//        return array;
//    }
//}
