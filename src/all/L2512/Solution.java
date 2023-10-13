package all.L2512;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        int n = student_id.length;
        Map<String, Integer> feedbackMap = new HashMap<>();
        List<Integer[]> list = new ArrayList<>();
        Arrays.stream(positive_feedback).forEach(i -> feedbackMap.put(i, 3));
        Arrays.stream(negative_feedback).forEach(i -> feedbackMap.put(i, -1));
        for (int i = 0; i < n; i++) {
            list.add(new Integer[]{student_id[i]
                    , Arrays.stream(report[i].split(" "))
                    .filter(feedbackMap::containsKey)
                    .map(feedbackMap::get)
                    .mapToInt(Integer::intValue)
                    .sum()});
        }
        return list.stream()
                .sorted((i, j) -> j[1].equals(i[1]) ? i[0].compareTo(j[0]) : j[1].compareTo(i[1]))
                .limit(k).map(i -> i[0])
                .collect(Collectors.toList());
    }
}
