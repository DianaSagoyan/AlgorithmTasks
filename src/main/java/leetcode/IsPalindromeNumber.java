package leetcode;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        int num = 34543;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num){

        if(num < 0) return false;

        int duplicate = num;
        int result = 0;

        while (duplicate > 0){
            int digit = duplicate % 10;
            result = result * 10 + digit;
            duplicate /= 10;
        }
        return duplicate == num;
    }
}
