package array_string.random_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RandomSet {
    private Map<Integer, Integer> map;

    public RandomSet() {
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        return map.putIfAbsent(val, val) == null;
    }

    public boolean remove(int val) {
        return map.remove(val) != null;
    }

    public int getRandom() {
        int rand = (int)(Math.random()*map.size());
        ArrayList<Integer> list = new ArrayList<>(map.values());
        return list.get(rand);
    }
}
