package dsa_algos;

import java.util.Arrays;

public class Task34_LongestCommonPrefix {
    public static void main(String[] args) {
        //Write a function to find the longest common prefix string amongst an array of strings.
        //
        //If there is no common prefix, return an empty string "".

        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        String result = "";
        int index = 0;

        while (index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                result += str1.charAt(index);
                index++;
            } else break;
        }
        return result;
    }
}
