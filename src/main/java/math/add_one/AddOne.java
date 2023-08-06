package math.add_one;

public class AddOne {
    public int[] plusOne(int[] digits) {
        int l = digits.length;

        if (digits[l - 1] != 9) {
            digits[l - 1] = ++digits[l - 1];
            return digits;
        }

        while (digits[--l] == 9) {
            digits[l] = 0;
            if (l == 0) break;
        }

        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        } else {
            digits[l] = ++digits[l];
            int[] res = new int[digits.length];
            System.arraycopy(digits, 0, res, 0, digits.length);
            return res;
        }
    }
}
