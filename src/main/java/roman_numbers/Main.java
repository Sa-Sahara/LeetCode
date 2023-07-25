package roman_numbers;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        BetterSolution b = new BetterSolution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(b.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(b.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(b.romanToInt("MCMXCIV"));
    }
}
