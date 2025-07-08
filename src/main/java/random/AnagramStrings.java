package random;

public class AnagramStrings {
    public static void main(String[] args) {
        String str = "racuecar";
        System.out.println(isAnagram(str));
    }

    public static boolean isAnagram(String str){
        boolean isAnagram = true;
        int pointer1 = 0, pointer2 = str.length() - 1;

        while (pointer1 < pointer2){
            if(str.charAt(pointer1) == str.charAt(pointer2)){
                pointer1++;
                pointer2--;
            } else {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }
}
