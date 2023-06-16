package dsa_algos;

public class Task42_ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverseNumber(num));
    }

    public static int reverseNumber(int num){

        int result = 0;

        while (num != 0) {
            int digit = num % 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;

            result = result * 10 + digit;

            num = num / 10;
        }
        return result;
    }
}
