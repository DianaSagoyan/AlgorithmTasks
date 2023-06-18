package dsa_algos;

public class Task43_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        //You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
        // There are at least two different characters in letters.
        //
        //Return the smallest character in letters that is lexicographically greater than target.
        // If such a character does not exist, return the first character in letters.

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(smallestLetterGreaterThanTarget(letters, target));
    }

    public static char smallestLetterGreaterThanTarget(char[] letters, char target){

        if(letters[letters.length - 1] < target) return letters[0];

        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target) return letters[i];
        }
        return letters[0];
    }
}
