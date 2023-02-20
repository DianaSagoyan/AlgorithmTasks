package numbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfBinary {
    public static void main(String[] args) {

        String str1 = "1010";
        String str2 = "1011";
        System.out.println(binarySum(str1, str2));

    }

    public static int binarySum(String str1, String str2){

        String result = "";
        int val1 = 0;
        int val2 = 0;

        for (int i = str1.length() - 1, j = 0; i >= 0; i--, j++) {
            if(str1.charAt(i) == '0') continue;
            if(str1.charAt(i) == '1') val1 += Math.pow(2, j);
        }

        for (int i = str2.length() - 1, j = 0; i >= 0; i--, j++) {
            if(str2.charAt(i) == '0') continue;
            if(str2.charAt(i) == '1') val2 += Math.pow(2, j);
        }

        List<Integer> nums = new ArrayList<>();



        return val1 + val2;
    }
}
