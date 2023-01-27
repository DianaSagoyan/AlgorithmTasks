package strings;

public class StringToInteger {
    //  write a program that can convert a string to integer. DO NOT use parse or valueOf methods

    public static void main(String[] args) {
        String str = "1723466";
        System.out.println(stringToIntegerConvert(str));
    }

    public static int stringToIntegerConvert(String str){

        int result = 0;
        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            result += Math.pow(10, arr.length - 1 - i) * ((int)str.charAt(i) - 48);
        }

        return result;
    }
}
