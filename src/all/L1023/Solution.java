package all.L1023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        Map<Integer,List<String>> map = new HashMap<>();
        List<String> patternList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            List<String> list = new ArrayList<>();
            extracted(queries[i], list);
            map.put(i,list);
        }

        extracted(pattern, patternList);

        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).size()!=patternList.size()) {
                booleanList.add(false);
            }else {
                booleanList.add(indexOfList(map.get(i), patternList));
            }
        }
        return booleanList;
    }
    private static boolean indexOfList (List<String> list1,List<String> list2) {
        for (int i = 0; i < list1.size(); i++) {

            String str1 = list1.get(i);
            String str2 = list2.get(i);

            for (int j = 0; j < str2.length(); j++) {
                int flag = str1.indexOf(str2.charAt(j));
                if (flag == -1) {
                    return false;
                } else {
                    str1 = str1.substring(flag+1);
                }
            }
//            if (!list1.get(i).contains(list2.get(i))) {
//                return false;
//            }
        }
        return true;
    }

    private static void extracted(String query, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < query.length(); j++) {
            char flag =  query.charAt(j);
            if (flag <= 'Z') {
                if (stringBuilder.length() == 0) {
                    stringBuilder.append(flag);
                }else {
                    if (stringBuilder.charAt(0) <= 'Z') {
                        list.add(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(flag);
                }
            }else {
                stringBuilder.append(flag);
            }
        }
        if (stringBuilder.length() != 0) {
            list.add(stringBuilder.toString());
        }
    }

    public static void main(String[] args) {
//        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//        String pattern = "FB";
//        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
//        String pattern = "FoBaT";

//        {"uAxaqlzahfialcezsLfj","cAqlzyahaslccezssLfj","AqlezahjarflcezshLfj","AqlzofahaplcejuzsLfj","tAqlzahavslcezsLwzfj","AqlzahalcerrzsLpfonj","AqlzahalceaczdsosLfj","eAqlzbxahalcezelsLfj"}
//        "AqlzahalcezsLfj"
//        String[] queries = {"CompetitiveProgramming","CounterPick","ControlPanel"};
//        String pattern = "CooP";
        String[] queries = {"uAxaqlzahfialcezsLfj","cAqlzyahaslccezssLfj","AqlezahjarflcezshLfj","AqlzofahaplcejuzsLfj","tAqlzahavslcezsLwzfj","AqlzahalcerrzsLpfonj","AqlzahalceaczdsosLfj","eAqlzbxahalcezelsLfj"};
        String pattern = "AqlzahalcezsLfj";
        System.out.println(camelMatch(queries, pattern));
    }





}
