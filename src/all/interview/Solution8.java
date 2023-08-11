package all.interview;

import java.util.Arrays;
import java.util.HashMap;

public class Solution8 {
    public static String[] findLongestSubarray(String[] array) {

        int[] flags = new int[array.length];
        int[] sums = new int[array.length+1];

        for (int i = 0; i <= flags.length; i++) {
            if (i<flags.length) {
                if (array[i].charAt(0) - 'A' >=0) {
                    flags[i] = 1;
                }else {
                    flags[i] = -1;
                }
                if (i == 0) {
                    sums[i] = 0;
                    continue;
                }
            }
            sums[i] = sums[i-1] + flags[i-1];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int left=0,right=0,max = 0;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] ==0) {
                max = Math.max(max,i+1);
                left = 0;
                right = i;
            }
            if (map.containsKey(sums[i])) {
                if (max<i-map.get(sums[i])) {
                    left = map.get(sums[i]);
                    right = i;
                    max = right-left;
                }
            }else {
                map.put(sums[i],i);
            }
        }
        String[] str1 = {};
        if (max == 0)  {
            return str1;
        }
        String[] str = new String[right-left];
        System.arraycopy(array,left,str,0,right-left);
        return str;
    }

    public static void main(String[] args) {
        String[] str = {"A","1"};
        String[] str2 = {"42","10","O","t","y","p","g","B","96","H","5","v","P","52","25","96","b","L","Y","z","d","52","3","v","71","J","A","0","v","51","E","k","H","96","21","W","59","I","V","s","59","w","X","33","29","H","32","51","f","i","58","56","66","90","F","10","93","53","85","28","78","d","67","81","T","K","S","l","L","Z","j","5","R","b","44","R","h","B","30","63","z","75","60","m","61","a","5","S","Z","D","2","A","W","k","84","44","96","96","y","M"};
        String[] str1 = {"A","1","B","C","D","2","3","4","E","5","F","G","6","7","H","I","J","K","L","M"};
        System.out.println(Arrays.toString(findLongestSubarray(str)));

    }
}
//["d","52","3","v","71","J","A","0","v","51","E","k","H","96","21","W","59","I","V","s","59","w","X","33","29","H","32","51","f","i","58","56","66","90","F","10","93","53","85","28","78","d","67","81","T","K","S","l","L","Z","j","5","R","b","44","R","h","B","30","63","z","75","60","m","61","a","5"]
//["52","3","v","71","J","A","0","v","51","E","k","H","96","21","W","59","I","V","s","59","w","X","33","29","H","32","51","f","i","58","56","66","90","F","10","93","53","85","28","78","d","67","81","T","K","S","l","L","Z","j","5","R","b","44","R","h","B","30","63","z","75","60","m","61","a","5"]
