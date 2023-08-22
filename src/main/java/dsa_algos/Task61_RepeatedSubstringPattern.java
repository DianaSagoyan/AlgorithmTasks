package dsa_algos;

public class Task61_RepeatedSubstringPattern {
    public static void main(String[] args) {
        //Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
        //Input: s = "abab"
        //Output: true
        //Explanation: It is the substring "ab" twice.

        String str = "abcabc";
        System.out.println(hasRepeatingSubstring(str));
    }

    public static boolean hasRepeatingSubstring(String str){
        String concat = str + str;
        String sub = concat.substring(1, concat.length() - 1);

        return sub.contains(str);
    }
}
