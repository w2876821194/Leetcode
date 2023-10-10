//package f1;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class L7005 {
//}
//
//class klausur.L深信服.Solution {
//    public boolean checkStrings(String s1, String s2) {
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//        Map<Character, Integer> map3 = new HashMap<>();
//        Map<Character, Integer> map4 = new HashMap<>();
//
//        for (int i = 0; i < s1.length(); i++) {
//            if ((i & 1) == 0) {
//                map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
//                map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
//            }else {
//                map3.put(s1.charAt(i), map3.getOrDefault(s1.charAt(i), 0) + 1);
//                map4.put(s2.charAt(i), map4.getOrDefault(s2.charAt(i), 0) + 1);
//            }
//        }
//
//        for (Character i:map1.keySet()) {
//            if (!Objects.equals(map1.get(i), map2.get(i))) {
//                return false;
//            }
//        }
//
//        for (Character i:map3.keySet()) {
//            if (!Objects.equals(map3.get(i), map4.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
