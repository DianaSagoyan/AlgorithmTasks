package dsa_algos;

public class Task58_FindIndexOfFirstOccurrence {
    public static void main(String[] args) {
        //Given two strings needle and haystack, return the index of the first occurrence
        // of needle in haystack, or -1 if needle is not part of haystack.

        String haystack = "kkksuccessandonlysuccess";
        String needle = "success";

        System.out.println(firstOccurrence(haystack, needle));
    }

    public static int firstOccurrence(String hayStack, String needle){

        int index = -1;

        for (int i = 0; i < hayStack.length(); i++) {
            if(hayStack.indexOf(needle) == i) index = i;
        }

        return index;
    }
}
