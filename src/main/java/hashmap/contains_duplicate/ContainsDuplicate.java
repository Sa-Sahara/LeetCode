package hashmap.contains_duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < length; i++){
            Optional<Integer> opt = Optional.ofNullable(map.putIfAbsent(nums[i], i));
            if (opt.isPresent()){
                if (i - opt.get() <= k) return true;
                else map.put(nums[i], i);
            }
        }
        return false;
    }
}
