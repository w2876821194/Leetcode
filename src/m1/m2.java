package m1;

import java.util.*;
import java.util.stream.Collectors;

public class m2 {
    public static void main(String[] args) {
//        5
//int f(int x)
//void f()
//int f()
//int solve(Node node,int x)
//int f(int y)

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Set<List<String>>> hashMap = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {

                Set<List<String>> set = new HashSet<>();
                set.add(getValue(array[i]));
                hashMap.put(getName(array[i]), set);
                System.out.println("Yes");
            } else {
                String name = getName(array[i]);
                List<String> value = getValue(array[i]);
                if (hashMap.containsKey(name)) {
                    if (!hashMap.get(name).contains(value)) {
                        hashMap.get(name).add(value);
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    Set<List<String>> set = new HashSet<>();
                    set.add(value);
                    hashMap.put(name,set);
                    System.out.println("Yes");
                }
            }
        }


    }

    public static String getName(String str) {
        int left = str.indexOf(" ");
        int right = str.indexOf("(");
        return str.substring(left, right);
    }

    public static List<String> getValue(String str) {
        int left, right;
        left = str.indexOf("(");
        right = str.indexOf(")");
        if (left + 1 == right) {
            return new ArrayList<>();
        } else {
            List<String> collect = Arrays.stream(str.substring(left + 1, right).split(",")).map((s) -> {
                int n = s.indexOf(" ");
                return s.substring(0, n);
            }).collect(Collectors.toList());
            return collect;
        }

    }

}
