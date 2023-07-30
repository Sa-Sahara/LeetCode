package hashmap.happy_number;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = sumOfDigits(slow);
            fast = sumOfDigits(sumOfDigits(fast));

            if (slow == 1 || fast == 1 || slow == 7 || fast == 7)
                return true;
        } while (slow != fast);

        return false;
    }

    public int sumOfDigits(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }
}
