package dsa_algos;

import java.util.*;

public class Task77_WordBreak {
    public static void main(String[] args) {
        //Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a
        // space-separated sequence of one or more dictionary words.
        //
        //Note that the same word in the dictionary may be reused multiple times in the segmentation.

        String s = "leetcode";
        List<String> list = new ArrayList<>(Arrays.asList("leet", "code"));

        System.out.println(wordBreak(s, list));
    }

    public static boolean wordBreak(String s, List<String> list){
        boolean[] result = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>(list);
        result[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for (int j = 0; j < i; j++) {
                if(set.contains(s.substring(j, i)) && result[j]){
                    result[i] = true;
                    break;
                }
            }
        }
        return result[s.length()];
    }
}
