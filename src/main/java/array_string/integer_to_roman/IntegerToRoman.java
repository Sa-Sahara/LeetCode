package array_string.integer_to_roman;

public class IntegerToRoman {
    public String intToRoman(int num) {
        char[] result = new char[16];
        int i = 0;
        int tmp;
        while (num != 0) {
            if (num >= 1000) {
                while (num / 1000 >= 1) {
                    result[i++] = 'M';
                    num -= 1000;
                }
            } else if (num >= 100) {
                tmp = num / 100;
                if (tmp == 9 || tmp == 4) {
                    result[i++] = 'C';
                    num += 100;
                } else if (tmp >= 5) {
                    result[i++] = 'D';
                    num -= 500;
                } else {
                    while (tmp != 0) {
                        result[i++] = 'C';
                        num -= 100;
                        --tmp;
                    }
                }
            } else if (num >= 10) {
                tmp = num / 10;
                if (tmp == 9 || tmp == 4) {
                    result[i++] = 'X';
                    num += 10;
                } else if (tmp >= 5) {
                    result[i++] = 'L';
                    num -= 50;
                } else {
                    while (tmp != 0) {
                        result[i++] = 'X';
                        num -= 10;
                        --tmp;
                    }
                }
            } else {
                if (num == 9 || num == 4) {
                    result[i++] = 'I';
                    num += 1;
                } else if (num >= 5) {
                    result[i++] = 'V';
                    num -= 5;
                } else {
                    while (num != 0) {
                        result[i++] = 'I';
                        --num;
                    }
                }
            }
        }
        return String.valueOf(result, 0, i);
    }
}
