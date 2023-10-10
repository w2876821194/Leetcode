//package match.L364;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//class Solution {
//    public long maximumSumOfHeights(List<Integer> maxHeights) {
//        int size = maxHeights.size();
//        int[] arr = maxHeights.stream().mapToInt(Integer::intValue).toArray();
//        long sum = Integer.MIN_VALUE;
//        PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>((i, j) -> j[0] - i[0]);
//        for (int i = 0; i < size; i++) {
//            priorityQueue.add(new Integer[]{maxHeights.get(i), i});
//        }
//        while (!priorityQueue.isEmpty()) {
//            Integer[] poll = priorityQueue.poll();
//            if ((long) poll[0] * size <= sum) {
//                break;
//            }
//            int[] arrays = Arrays.copyOf(arr, size);
//            for (int i = poll[1] + 1; i < size; i++) {
//                if (arrays[i] > arrays[i - 1]) {
//                    arrays[i] = arrays[i - 1];
//                }
//            }
//            for (int i = poll[1] - 1; i >= 0; i--) {
//                if (arrays[i] > arrays[i + 1]) {
//                    arrays[i] = arrays[i + 1];
//                }
//            }
//            sum = Math.max(Arrays.stream(arrays).summaryStatistics().getSum(), sum);
//        }
//        return sum;
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new Solution().maximumSumOfHeights(Arrays.asList(5,3,4,1,1));
//    }
//}
