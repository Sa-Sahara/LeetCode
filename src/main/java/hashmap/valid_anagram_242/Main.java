package hashmap.valid_anagram_242;

public class Main {
    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();
        System.out.println(v.isAnagram("anagram",  "nagaram"));
        System.out.println(v.isAnagram2Variant("anagram",  "nagaram"));
        System.out.println(v.isAnagram3Variant("anagram",  "nagaram"));
        System.out.println();
        System.out.println(v.isAnagram("rat", "car"));
        System.out.println(v.isAnagram2Variant("rat", "car"));
        System.out.println(v.isAnagram3Variant("rat", "car"));
    }
}
