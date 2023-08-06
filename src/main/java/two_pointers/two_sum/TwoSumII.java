package two_pointers.two_sum;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end){
            if (numbers[end] + numbers[start] > target){
                --end;
            }
            if (numbers[end] + numbers[start] < target){
                ++start;
            }
            if (numbers[end] + numbers[start] == target) {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[2];
    }
}
