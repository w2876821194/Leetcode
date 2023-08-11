//package all.L399;
//
//import java.util.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
//class Solution {
//    class Node {
//        String s;
//        Double value;
//        AtomicInteger atomicInteger;
//
//        public Node(String s, Double value, AtomicInteger atomicInteger) {
//            this.s = s;
//            this.value = value;
//            this.atomicInteger = atomicInteger;
//        }
//    }
//
//    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
//        Set<String> set = new HashSet<>();
//        Map<String, Integer> map = new HashMap<>();
//        List<Integer[]> list = new ArrayList<>();
//        equations.forEach(set::addAll);
//        int length = set.size();
//        double[][] arr = new double[length][length];
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        set.forEach(i -> {
//            map.put(i, atomicInteger.get());
//            atomicInteger.incrementAndGet();
//        });
//        for (int k = 0, equationsSize = equations.size(); k < equationsSize; k++) {
//            List<String> equation = equations.get(k);
//            int i = map.get(equation.get(0));
//            int j = map.get(equation.get(0));
//            list.add(new Integer[]{i, j});
//            arr[i][j] = values[k];
//        }
//        for (int i = 0; i < list.size(); i++) {
//            Integer[] integers = list.get(i);
//            arr[integers[0]][integers[1]] =
//        }
//
//    }
//}
