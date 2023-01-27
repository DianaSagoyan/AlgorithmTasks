package tasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String text = "''This''      is  an example! of Example...";
        System.out.println(countWords(text));
    }

    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> result = new HashMap<>();
        text = text.toLowerCase();

        int nonChar = 0;
        int letter = 0;

        while (letter != text.length() - 1){
            if(!Character.isLetter(text.charAt(nonChar))){
                nonChar++;
                letter++;
            }else if(Character.isLetter(text.charAt(nonChar))){
                letter++;
                while (Character.isLetter(text.charAt(letter)) && letter != text.length() - 1){
                    letter++;
                }
                if(letter != text.length() - 1){
                    result.put(text.substring(nonChar, letter), result.getOrDefault(text.substring(nonChar, letter), 0) + 1);
                    nonChar = letter;
                } else {
                    result.put(text.substring(nonChar), result.getOrDefault(text.substring(nonChar, letter), 0) + 1);
                }
            }
        }
        return result;
    }
}
