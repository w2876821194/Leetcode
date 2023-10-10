//package match.L361;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class L2 {
//}
//
//// 0 00 25 50 75
//class klausur.L深信服.Solution {
//    public int minimumOperations(String num) {
//        int min = num.length();
//        if (num.contains("0")) {
//            min--;
//        }
//        List<String[]> strings = Arrays.stream("00|52|05|57".split("\\|")).map(i -> i.split("")).collect(Collectors.toList());
//        for (int i = 0; i < strings.size(); i++) {
//            String str = num;
//            String[] strings1 = strings.get(i);
//            if (str.contains(strings1[0])&&str.substring(0,str.lastIndexOf(strings1[0])).contains(strings1[1])) {
//                int n = str.length()-str.substring(0,str.lastIndexOf(strings1[0])).lastIndexOf(strings1[1])-2;
//                min = Math.min(min,n);
//            }
//        }
//        return min;
//    }
//}
