package strings;

public class CountOfRepeatedChars {
    // Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->  a2b1c3d2a4

    public static void main(String[] args) {

        String str = "aabcccddaaaa";
        System.out.println(countRepeatedChars(str));
    }

    public static String countRepeatedChars(String str){

        String result = "";
        int pointer1 = 0;
        int pointer2 = 0;
        int count = 0;

        while (pointer2 != str.length()){

            if(str.charAt(pointer1) == str.charAt(pointer2)){
                count++;
                pointer2++;
            } else {
                result += str.charAt(pointer1) + "" + count;
                pointer1 = pointer2;
                count = 0;
            }

        }

        result += str.charAt(str.length() - 1) + "" + count;
        return result;
    }
}
