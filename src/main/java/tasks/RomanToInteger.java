package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "III";
        System.out.println(romanToInteger(roman));
    }

    public static int romanToInteger(String roman) {

        ArrayList<Integer> charNums = new ArrayList<>();

        for (char ch : roman.toCharArray()) {
            charNums.add(value(ch));
        }
        int num = 0;

        for (int i = 0; i < charNums.size() - 1; i++) {
            if(charNums.get(i) >= charNums.get(i + 1)) num += charNums.get(i);
            else if(charNums.get(i) < charNums.get(i + 1)) num -= charNums.get(i);
        }
        return num + charNums.get(charNums.size() - 1);
    }

    public static int value(char ch) {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return -1;
    }

}
