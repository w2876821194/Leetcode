package all.L146;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache {

    private final List<Integer> keys;
    private final Map<Integer, Integer> map;
    private final int size;


    public LRUCache(int capacity) {
        this.size = capacity;
        keys = new ArrayList<>();
        map = new HashMap<>();
    }

    public int get(int key) {
        Integer integer = key;
        if (keys.contains(key)) {
            keys.remove(integer);
            keys.add(integer);
        }
        return map.getOrDefault(integer, -1);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            keys.remove((Integer) key);
        } else if (keys.size() == size) {
            Integer remove = keys.remove(0);
            map.remove(remove);
        }
        keys.add(key);
        map.put(key, value);
    }
}

class Test {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
