//package sword_offer.L16;
//
//import java.math.BigDecimal;
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//public class jz45 {
//}
//
//class Solution {
//    public String minNumber(int[] nums) {
//        if (nums == null) {
//            return "";
//        }
//        String[] list = Arrays.stream(nums)
//                .mapToObj(String::valueOf)
//                .toArray(String[]::new);
//        return Arrays.stream(list).sorted((o1, o2) -> new BigDecimal(o1 + o2).compareTo(new BigDecimal(o2 + o1))).collect(Collectors.joining());
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().minNumber(new int[]{3, 30, 34, 5, 9});
//    }
//}
