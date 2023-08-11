package all.interview;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public static String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<names.length;i++) {
            // new
            if (map.containsKey(names[i])==false) {
                map.put(names[i],1);
                // 判断给字符串是否有父亲
                if (names[i].charAt(names[i].length()-1) == ')') {
                    // 判断去掉索引的字符串在map中有无
                    String name = names[i].substring(0,names[i].length()-3);
                    int value = Integer.parseInt(names[i].substring(names[i].lastIndexOf("(")+1, names[i].lastIndexOf(")")));
                    if (map.containsKey(name)&&map.get(name) == value) {
                        map.put(name, map.get(name)+1);
                    }
                }

            }else {
                // map 中有
                String name = names[i];
                int index = map.get(names[i]);
                names[i] = names[i]+"("+map.get(names[i])+")";

                // 两种情况 后缀只能加一次
                // 当前字符串前面存在,加后缀后加值  b(1),b,b
                // 若当前字符串加后缀后前面存在,则再加后缀
                // !map.containsKey(names[i] + "(" + map.get(names[i]) + ")")
//                if (map.containsKey(name)) {
//
//                    // 加值
//                }
//                while (true)  {
//                    // 判断加了扩展是否还有
//                    if (map.containsKey(names[i]) == true) {
//                        // 有进一步扩展
//                        name = names[i];
//                        names[i] = names[i]+"("+map.get(names[i])+")";
//                    }else {
//                        break;
//                    }
//                }


                while (true)  {
                    // 判断加了扩展是否还有
                    if (map.containsKey(names[i])) {
                        // 进一步++
                        index++;
                        names[i] = name+"("+index+")";
                    }else {
                        break;
                    }
                }
                map.put(name,map.get(name)+1);
                map.put(names[i],1);
            }

        }
        return names;
    }

    public static void main(String[] args) {
        String[] str = {"pes","fifa","gta","pes(2019)"};
        String[] str1 = {"b(1)","b","b"};
        getFolderNames(str1);
        System.out.println(Arrays.asList(str1));
    }
}
//["v(1)","r","k","e","h(3)","t","b(1)","s(4)","n(1)(4)","u(2)(4)","c(1)","v(4)(4)","f","m","y","w","p","n","j","i","z","b","h","r(1)","w(1)","j(1)","i(1)","h(4)","f(1)","u(1)","c","k(1)","t(2)(4)","m(1)","o(3)","s","e(1)","m(3)(4)","q","h(1)(3)","f(2)","w(2)","t(1)","w(3)","u(1)(2)","j(2)","k(2)","k(3)","n(1)","a","b(1)(1)","v"]
//["v(1)","r","k","e","h(3)","t","b(1)","s(4)","n(1)(4)","u(2)(4)","c(1)","v(4)(4)","f","m","y","w","p","n","j","i","z","b","h","r(1)","w(1)","j(1)","i(1)","h(4)","f(1)","u(1)","c","k(1)","t(2)(4)","m(1)","o(3)","s","e(1)","m(3)(4)","q","h(1)(3)","f(2)","w(2)","t(1)","w(3)","u(1)(2)","j(2)","k(2)","k(3)","n(1)","a","b(2)","v"]
