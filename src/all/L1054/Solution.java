package all.L1054;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {

        Integer[] integerBarcodes = Arrays.stream(barcodes).boxed().toArray(Integer[]::new);

        Map<Integer,Long> map = Arrays.stream(integerBarcodes).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int i = 0;
        while (!map.isEmpty()) {
            Set<Integer> integers = map.keySet();
            Iterator<Integer> iterator = integers.iterator();
            while (iterator.hasNext()) {
                Integer next  = iterator.next();
                barcodes[i++] = next;
                if (map.get(next) == 1) {
                    iterator.remove();
                }else {
                    map.put(next,map.get(next)-1);
                }
            }
        }
        return barcodes;
    }

    public static void main(String[] args) {
        int [] barcodes = {1,1,1,2,2,2};
        new Solution().rearrangeBarcodes(barcodes);
    }
}
