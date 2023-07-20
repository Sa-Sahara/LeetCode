package merge_array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = new int[m + n];
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < copy.length; i++) {
            if (counter1 >= m) {
                copy[i] = nums2[counter2++];
            } else if (counter2 >= n) {
                copy[i] = nums1[counter1++];
            } else {
                if (nums1[counter1] <= nums2[counter2]) {
                    copy[i] = nums1[counter1++];
                } else {
                    copy[i] = nums2[counter2++];
                }
            }
        }
        System.arraycopy(copy, 0, nums1, 0, m + n);
    }
}
