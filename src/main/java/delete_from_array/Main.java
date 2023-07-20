package delete_from_array;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2};
//        int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
        int val = 3;

        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums1, val));
    }
}
