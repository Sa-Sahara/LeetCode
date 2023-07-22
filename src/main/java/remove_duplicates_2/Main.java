package remove_duplicates_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates2 r = new RemoveDuplicates2();
//        int[] arr = new int[]{0,0,0}; //+
//        int[] arr = new int[]{0,0}; //+
//        int[] arr = new int[]{0}; //+
//        int[] arr = new int[]{0,0,0,0,0,0}; //+
//        int[] arr = new int[]{0,0,1,1,1,1,2,3,3}; //+
        int[] arr = new int[]{1,1,1,2,2,3}; //+
        System.out.println(r.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
