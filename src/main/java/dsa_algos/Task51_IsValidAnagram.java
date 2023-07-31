package dsa_algos;

import java.util.Arrays;

public class Task51_IsValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isValidAnagram(s, t));
    }

    public static boolean isValidAnagram(String s, String t){
        //Leetcode accepted solution

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
