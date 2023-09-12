package hashmap.longest_seq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSeq {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // Map <start, end>
        HashMap<Integer, Integer> starts = new HashMap<>();
        // Map <end, start>
        HashMap<Integer, Integer> ends = new HashMap<>();

        Set<Integer> visited = new HashSet<>();
        int maxLength = 1; //as nums.length > 0
        int startOfRemoved;
        int endOfRemoved;

        for (int i : nums) {
            if (!(visited.contains(i))) {
                if (starts.containsKey(i + 1)) {
                    if (ends.containsKey(i - 1)) {
                        startOfRemoved = ends.remove(i - 1);
                    } else {
                        startOfRemoved = i;
                    }
                    endOfRemoved = starts.remove(i + 1);

                    starts.put(startOfRemoved, endOfRemoved);
                    ends.put(endOfRemoved, startOfRemoved);

                    maxLength = Math.max(endOfRemoved - startOfRemoved + 1, maxLength);

                } else if (ends.containsKey(i - 1)) {
                    endOfRemoved = i;
                    startOfRemoved = ends.remove(i - 1);

                    ends.put(endOfRemoved, startOfRemoved);
                    starts.put(startOfRemoved, endOfRemoved);

                    maxLength = Math.max(endOfRemoved - startOfRemoved + 1, maxLength);

                } else {
                    starts.put(i, i);
                    ends.put(i, i);
                }
            }
            visited.add(i);
        }
        return maxLength;
    }
}