package leetcode.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring2 {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longestNonRepeatingSubstring(str));
    }

    public static int longestNonRepeatingSubstring(String str){

        int pointer1 = 0;
        int pointer2 = 0;
        int maxLength = 0;
        int count = 0;

        Set<Character> letters = new HashSet<>();

        while (pointer2 != str.length()){

            if(!letters.contains(str.charAt(pointer2))){
                letters.add(str.charAt(pointer2));
                count++;
                pointer2++;
            }else{
                pointer1++;
                pointer2 = pointer1 + 1;

                if(count > maxLength) maxLength = count;
                count = 0;
                letters.clear();
            }
        }

        return maxLength;
    }
}
