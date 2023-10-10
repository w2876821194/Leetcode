package all.L1333;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        return Arrays.stream(restaurants)
                .filter(i -> (veganFriendly != 1 || i[2] == 1) && maxPrice >= i[3] && maxDistance >= i[4])
                .sorted((i, j) -> j[1] - i[1] != 0 ? j[1] - i[1] : j[0] - i[0])
                .map(i -> i[0]).collect(Collectors.toList());
    }
}
