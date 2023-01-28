package strings;

import java.util.Arrays;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "DDDAACCCCCCB";
        System.out.println(sortedFrequencyOfCharacters(str));
    }

    public static String sortedFrequencyOfCharacters(String str){

        String result = "";
        int pointer1 = 0;
        int pointer2 = 0;
        int count = 0;

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        while (pointer2 != arr.length){

            if(arr[pointer1] == arr[pointer2]){
                count++;
                pointer2++;
            } else {
                result += arr[pointer1] + "" + count;
                count = 0;
                pointer1 = pointer2;
            }
        }

        result += arr[pointer1] + "" + count;
        return result;
    }
}
