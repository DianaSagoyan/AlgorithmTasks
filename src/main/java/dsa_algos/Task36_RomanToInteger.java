package dsa_algos;

import java.util.ArrayList;
import java.util.List;

public class Task36_RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInteger(roman));
    }

    public static int romanToInteger(String roman){
        List<Integer> nums = new ArrayList<>();
        int number = 0;

        for(char letter: roman.toCharArray()){
            nums.add(value(letter));
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i) >= nums.get(i + 1)) number += nums.get(i);
            else number -= nums.get(i);
        }
        return number += nums.get(nums.size() - 1);
    }

    public static int value(char letter){
        switch (letter){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
