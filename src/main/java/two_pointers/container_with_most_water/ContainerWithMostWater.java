package two_pointers.container_with_most_water;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int result = 0;

        while (start < end) {
            result = Math.max(result,
                    Math.min(height[start], height[end]) * (end - start));

            if (height[start] > height[end]) {
                --end;
            } else {
                ++start;
            }
        }

        return result;
    }
}
