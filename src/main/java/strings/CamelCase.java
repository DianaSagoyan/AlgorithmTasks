package strings;

public class CamelCase {
       /*
    Camel Case
    Have the function Camel Case (str) take the str parameter being passed and return it in proper
    camel case format where the first letter of each word is capitalized (excluding the first letter).
    The string will only contain letters and some combination of delimiter punctuation characters separating each word.
        For example:
            if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
        Examples
            Input: "cats AND*Dogs-are Awesome"
            Output: catsAndDogsAreAwesome
            Input: "a b c d-e-f%g"
            Output: aBCDEFG
     */

    public static void main(String[] args) {
        String str = "cats AND*Dogs-are Awesome";
        String str2 = "BOB loves-coding";
        String str3 = "a b c d-e-f%g";
        System.out.println(stringToCamelCase(str3));
    }

    //brute force
    public static String stringToCamelCase(String str){
        str = str.toLowerCase();
        String[] arr = str.split("[^a-zA]" );
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                result += arr[i];
            } else {
                result += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
        }

        return result;
    }
}
