package array_string.candy;

public class Candy {
    public int candy(int[] ratings) {
        int len = ratings.length;
        if (len == 1) return len;

        int[] res = new int[len];
        res[0] = 1;
        int candy = 0;

        for (int i = 1; i < len; i++) {
            if (ratings[i - 1] < ratings[i]) {
                res[i] = res[i - 1] + 1;
            } else {
                res[i] = 1;
                int tmpIndex = i - 1;
                while (
                        tmpIndex >= 0
                                && ratings[tmpIndex] > ratings[tmpIndex + 1]
                                && res[tmpIndex] <= res[tmpIndex + 1]) {
                    res[tmpIndex] = res[tmpIndex + 1] + 1;
                    --tmpIndex;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            candy += res[i];
        }
        return candy;
    }
}
