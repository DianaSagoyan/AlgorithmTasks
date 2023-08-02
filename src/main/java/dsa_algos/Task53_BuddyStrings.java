package dsa_algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task53_BuddyStrings {
    public static void main(String[] args) {
        //Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
        //
        //Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
        //
        //For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

        String s = "abcd";
        String goal = "cbad";

        System.out.println(areBuddyStrings(s, goal));
    }

    public static boolean areBuddyStrings(String s, String goal){

        if(s.length()  != goal.length()) return false;

        if(s.equals(goal)){
            Set<Character> set = new HashSet<>();

            for(char ch: s.toCharArray()) set.add(ch);

            return set.size() < s.length();
        }

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) diff.add(i);
        }

        if(diff.size() == 2 &&
        s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) &&
        s.charAt(diff.get(1)) == goal.charAt(diff.get(0))) return true;

        return false;
    }
}
