package dsa_algos;

public class Task66_MergeStringsAlternately {
    public static void main(String[] args) {
        //You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer
        // than the other, append the additional letters onto the end of the merged string.

        String word1 = "abcd";
        String word2 = "ln";

        System.out.println(mergeStrings(word1, word2));
    }

    public static String mergeStrings(String word1, String word2){
        String result = "";
        String longerStr = (word1.length() < word2.length()) ? word2 : word1;

        for (int i = 0; i < longerStr.length(); i++) {
            if(i >= word1.length()){
                result += word2.charAt(i);
                continue;
            }

            if(i >= word2.length()){
                result += word1.charAt(i);
                continue;
            }

            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        return result;
    }
}
