package tasks;

public class RomanToInteger2 {
    public static void main(String[] args) {
        String roman = "XIV";
        System.out.println(romanToInt(roman));
    }
    
    public static int romanToInt(String s) {
        int result = 0;
        int lastValue = 0;
        int currentValue = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I': currentValue = 1;
                    break;
                case 'V': currentValue = 5;
                    break;
                case 'X': currentValue = 10;
                    break;
                case 'L': currentValue = 50;
                    break;
                case 'C': currentValue = 100;
                    break;
                case 'D': currentValue = 500;
                    break;
                case 'M': currentValue = 1000;
                    break;
                default: currentValue = 0;
                    break;
            }
            result += currentValue;
            if (lastValue < currentValue) {
                result -= lastValue * 2;
            }
            lastValue = currentValue;
        }
        return result;
    }
}
