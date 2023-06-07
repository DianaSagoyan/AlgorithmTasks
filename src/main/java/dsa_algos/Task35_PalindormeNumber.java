package dsa_algos;

public class Task35_PalindormeNumber {
    //Given an integer x, return true if x is a
    //palindrome
    //, and false otherwise.
    public static void main(String[] args) {
        int num = -121;
        System.out.println(palindromeNumber(num));
    }

    public static boolean palindromeNumber(int num){
        if(num < 0) return false;

        String numStr = String.valueOf(num);
        int pointer1 = 0;
        int pointer2 = numStr.length() - 1;

        while (pointer1 < pointer2){
            if(numStr.charAt(pointer1) != numStr.charAt(pointer2)) return false;
            pointer1++;
            pointer2--;
        }
        return true;
    }
}
