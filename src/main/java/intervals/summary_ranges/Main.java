package intervals.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SummaryRanges s = new SummaryRanges();
        Solution2 s2 = new Solution2();
        int[] arr1 = new int[]{0, 1, 2, 4, 5, 7};
        List<String> l1;
        List<String> l11;
        l1 = s.summaryRanges(arr1);
        l11 = s2.summaryRanges(arr1);

        int[] arr2 = new int[]{0, 2, 3, 4, 6, 8, 9};
        List<String> l2;
        List<String> l22;
        l2 = s.summaryRanges(arr2);
        l22 = s2.summaryRanges(arr2);

        int[] arr3 = new int[]{-2, -1, 0, 2, 3, 4, 6};
        List<String> l3;
        List<String> l33;
        l3 = s.summaryRanges(arr3);
        l33 = s2.summaryRanges(arr3);

        for (String str :
                l3) {
            System.out.println(str);
        }
        System.out.println();
        for (String str :
                l33) {
            System.out.println(str);
        }
    }
}
