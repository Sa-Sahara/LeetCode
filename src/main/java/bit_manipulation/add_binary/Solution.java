package bit_manipulation.add_binary;

class Solution {
    public String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int leftover = 0;

        while (aLength >= 0 || bLength >= 0) {
            if (aLength >= 0) {
                leftover += Character.getNumericValue(a.charAt(aLength));
                aLength--;
            }
            if (bLength >= 0) {
                leftover += Character.getNumericValue(b.charAt(bLength));
                bLength--;
            }

            switch (leftover) {
                case 0 -> result.append("0");
                case 1 -> {
                    result.append("1");
                    leftover = 0;
                }
                case 2 -> {
                    result.append("0");
                    leftover = 1;
                }
                case 3 -> {
                    result.append("1");
                    leftover = 1;
                }
                default -> {
                }
            }

            if (aLength < 0 && bLength < 0 && leftover != 0) {
                result.append(leftover);
            }
        }
        return result.reverse().toString();
    }
}
