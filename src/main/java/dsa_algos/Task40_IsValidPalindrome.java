package dsa_algos;

public class Task40_IsValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }

    public static boolean isValidPalindrome(String str){

        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int pointer1 = 0;
        int pointer2 = str.length() - 1;

        while (pointer1 < pointer2){
            if(str.charAt(pointer1) != str.charAt(pointer2)) return false;
            pointer1++;
            pointer2--;
        }
        return true;
    }
}
