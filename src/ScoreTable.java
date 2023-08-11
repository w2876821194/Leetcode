import java.util.HashMap;
import java.util.Map;

public class ScoreTable {
    public static void main(String[] args) {
        // 初始化数据
        Map<String, Map<Integer, Map<String, Integer>>> scoreMap = new HashMap<>();
        addScore(scoreMap, "张三", 2014, "语文", 82);
        addScore(scoreMap, "张三", 2014, "数学", 88);
        addScore(scoreMap, "张三", 2015, "语文", 73);
        addScore(scoreMap, "张三", 2015, "数学", 73);
        addScore(scoreMap, "李四", 2014, "语文", 80);
        addScore(scoreMap, "李四", 2014, "数学", 60);
        addScore(scoreMap, "李四", 2015, "语文", 78);
        addScore(scoreMap, "李四", 2015, "数学", 82);
        addScore(scoreMap, "王五", 2016, "英语", 90);

        // 计算每个人每年的平均分数
        Map<String, Map<Integer, Double>> avgScoreMap = new HashMap<>();
        for (String name : scoreMap.keySet()) {
            Map<Integer, Map<String, Integer>> yearScoreMap = scoreMap.get(name);
            Map<Integer, Double> avgMap = new HashMap<>();
            for (int year : yearScoreMap.keySet()) {
                Map<String, Integer> subjectScoreMap = yearScoreMap.get(year);
                int totalScore = 0;
                int subjectCount = 0;
                for (String subject : subjectScoreMap.keySet()) {
                    int score = subjectScoreMap.get(subject);
                    totalScore += score;
                    subjectCount++;
                }
                double avgScore = (double) totalScore / subjectCount;
                avgMap.put(year, avgScore);
            }
            avgScoreMap.put(name, avgMap);
        }

        // 输出结果
        System.out.printf("%-10s", "");
        for (int year : avgScoreMap.get(avgScoreMap.keySet().iterator().next()).keySet()) {
            System.out.printf("%-10d", year);
        }
        System.out.println();
        for (String name : avgScoreMap.keySet()) {
            System.out.printf("%-10s", name);
            Map<Integer, Double> avgMap = avgScoreMap.get(name);
            for (int year : avgMap.keySet()) {
                System.out.printf("%-10.2f", avgMap.get(year));
            }
            System.out.println();
        }
    }

    private static void addScore(Map<String, Map<Integer, Map<String, Integer>>> scoreMap,
                                 String name, int year, String subject, int score) {
        if (!scoreMap.containsKey(name)) {
            scoreMap.put(name, new HashMap<>());
        }
        Map<Integer, Map<String, Integer>> yearScoreMap = scoreMap.get(name);
        if (!yearScoreMap.containsKey(year)) {
            yearScoreMap.put(year, new HashMap<>());
        }
        Map<String, Integer> subjectScoreMap = yearScoreMap.get(year);
        subjectScoreMap.put(subject, score);
    }
}
