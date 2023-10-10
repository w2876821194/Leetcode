package all.L460;

import java.util.*;

//class LFUCache extends LinkedHashMap<Integer, Integer> {
//    private final int capacity;
//
//    private final PriorityQueue<Integer[]> queue = new PriorityQueue<>((i, j) -> {
//        return i[1] - j[1];
//    });
//
//    private final HashMap<Integer, Integer[]> map = new HashMap<>();
//
//    public LFUCache(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        Integer integer = key;
//        if (map.containsKey(integer)) {
//            Integer[] num = map.get(integer);
//            queue.remove(num);
//            num[1]++;
//            queue.add(num);
//            map.put(integer, num);
//        }
//        return super.getOrDefault(key, -1);
//    }
//
//    public void put(int key, int value) {
//        // 已存在
//        if (map.containsKey(key)) {
//            Integer[] integers = map.get(key);
//            queue.remove(integers);
//            integers[1]++;
//            map.put(key, integers);
//            queue.add(integers);
//            super.put(key, value);
//            return;
//        }
//        // 已满
//        if (capacity == super.size()) {
//            Integer[] poll = queue.remove();
//            map.remove(poll[0]);
//            super.remove(poll[0]);
//        }
//        // 未满
//        Integer[] integers = {key, 0};
//        super.put(key, value);
//        queue.add(integers);
//        map.put(integers[0], integers);
//    }
//}

class Test {
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(3);
//        lfuCache.put(2, 1);
//        lfuCache.put(2, 2);
//        lfuCache.get(2);
//        lfuCache.put(1, 1);
//        lfuCache.put(4, 1);
//        lfuCache.get(2);

        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        lfuCache.put(3, 3);
        lfuCache.put(4, 4);
        lfuCache.get(4);
        lfuCache.get(3);
        lfuCache.get(2);
        lfuCache.get(1);
        lfuCache.put(5, 5);

        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(4));
        System.out.println(lfuCache.get(5));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.remove();

    }
}


/**
 * 460. LFU 缓存
 * LFU（Least Frequently Used）算法根据数据项被访问的频率来选择淘汰的对象。
 * 具体来说，它会跟踪每个数据项被访问的次数，并且在需要淘汰数据项时，选择访问次数最少的数据项进行淘汰
 *
 * @author jisl on 2023/9/25 8:29
 **/
class LFUCache {

    // 用于存储缓存键值对的哈希表
    private HashMap<Integer, int[]> dataMap;
    // 容量
    private final int capacity;
    // 用于存储每个频率对应的键的哈希表
    private HashMap<Integer, LinkedHashSet<Integer>> freqToKeysMap;
    // 当前缓存中访问频率最小的值
    private int minFrequency;

    public LFUCache(int capacity) {
        this.dataMap = new HashMap<>();
        this.freqToKeysMap = new HashMap<>();
        this.capacity = capacity;
        this.minFrequency = 1;
    }

    public int get(int key) {
        if (!dataMap.containsKey(key)) {
            return -1;
        }
        final int[] point = dataMap.get(key);
        updateFreq(key, point);
        return point[0];
    }

    private void updateFreq(int key, int[] point) {
//        当前频率
        int freq = point[1];
//        移除旧的频率值
        freqToKeysMap.get(freq).remove(key);
        if (minFrequency == freq && freqToKeysMap.get(minFrequency).isEmpty()) {
//            最小频率，没有值。那么说明当前key是最小频率，那么要加上当前值。
            minFrequency += 1;
        }
//        添加到新的频率
        freqToKeysMap.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
        point[1] += 1;
    }

    public void put(int key, int value) {
        if (dataMap.containsKey(key)) {
            final int[] point = dataMap.get(key);
            updateFreq(key, point);
            point[0] = value;
            dataMap.put(key, point);
        } else {
            if (dataMap.size() == capacity) {
//                超过容量，那么需要删除
                final LinkedHashSet<Integer> linkedHashSet = freqToKeysMap.get(minFrequency);
                if (!linkedHashSet.isEmpty()) {
                    final Integer oldKey = linkedHashSet.iterator().next();
                    dataMap.remove(oldKey);
                    linkedHashSet.remove(oldKey);
                }
            }
            dataMap.put(key, new int[]{value, 1});
            //computeIfAbsent 返回添加或计算后的值。如果键已经存在，它会返回现有的值；如果键不存在，它会根据提供的计算函数来计算新值，并将新值存储到映射中。
            //putIfAbsent 返回先前与键关联的值（如果键已经存在），如果键不存在，则返回 null。它只负责插入键值对，而不会执行额外的计算。
            freqToKeysMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFrequency = 1;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
