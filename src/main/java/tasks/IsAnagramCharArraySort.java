package tasks;

import java.util.Arrays;

public class IsAnagramCharArraySort {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "navgaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){

        char[] list1 = s.toCharArray();
        char[] list2 = t.toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}
