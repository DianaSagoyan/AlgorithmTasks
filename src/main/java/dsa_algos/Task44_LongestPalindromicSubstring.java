package dsa_algos;

public class Task44_LongestPalindromicSubstring {
    public static void main(String[] args) {
        //Given a string s, return the longest palindromic substring in s.
        //https://www.youtube.com/watch?v=DK5OKKbF6GI

        String str = "babad";
        System.out.println(longestPalindromicSubstring(str));
    }

    static int resultStart;
    static int resultLength;
    public static String longestPalindromicSubstring(String str){
        if(str.length() < 2) return str;

        for (int i = 0; i < str.length(); i++) {
            expandRange(str, i, i);
            expandRange(str, i, i + 1);
        }

        return str.substring(resultStart, resultStart + resultLength);
    }

    public static void expandRange(String str, int start, int end){
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }

        if(resultLength < end - start - 1){
            resultStart = start + 1;
            resultLength = end - start - 1;
        }
    }
}
