package all.L1993;

import java.util.*;

class LockingTree {
    private final Map<Integer, Set<Integer>> map = new HashMap<>();
    private final Map<Integer, Integer> parents = new HashMap<>();
    private final Map<Integer, Integer> lock = new HashMap<>();

    public LockingTree(int[] parent) {
        for (int i = 0; i < parent.length; i++) {
            Set<Integer> orDefault = map.getOrDefault(parent[i], new HashSet<>());
            orDefault.add(i);
            map.put(parent[i], orDefault);
            parents.put(i, parent[i]);
        }
    }

    public boolean lock(int num, int user) {
        if (!lock.containsKey(num)) {
            lock.put(num, user);
            return true;
        }
        return false;
    }

    public boolean unlock(int num, int user) {
        if (lock.containsKey(num) && lock.get(num) == user) {
            lock.remove(num);
            return true;
        }
        return false;
    }

    public boolean upgrade(int num, int user) {
        if (!lock.containsKey(num) && childFlag(num) && !parentFlag(num)) {
            lock.put(num, user);
            closeLock(num);
            return true;
        }
        return false;
    }

    /**
     * 移除其子节点的锁
     *
     * @param root
     */
    private void closeLock(Integer root) {
        if (root == null) {
            return;
        }
        if (map.get(root) == null) {
            System.out.println(root);
            return;
        }
        for (Integer num : map.get(root)) {
            lock.remove(num);
            closeLock(num);
        }
    }

    /**
     * 父节点是否有锁
     *
     * @param root
     * @return true 有 false 没有
     */
    private boolean parentFlag(Integer root) {
        while (root != null && !lock.containsKey(parents.get(root))) {
            root = parents.get(root);
        }
        return root != null;
    }

    /**
     * 子节点是否有锁
     *
     * @param root
     * @return true 有 false 没有
     */
    public boolean childFlag(Integer root) {
        if (root == null) {
            return false;
        }
        if (map.get(root) == null) {
            System.out.println(root);
            return false;
        }

        for (Integer child : map.get(root)) {
            if (lock.containsKey(child) || childFlag(child)) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
