package array_string.majority_element;

public class Optimal {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0;
        for (int tmp : nums) {
            if (count == 0) element = tmp;
            if (element == tmp) count++;
            else count--;
        }
        return element;
    }
}
