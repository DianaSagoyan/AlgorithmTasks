package strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "You will do it";
        System.out.println(removeWhiteSpace(str));
    }

    public static StringBuilder removeWhiteSpace(String str){

//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if(!Character.isWhitespace(str.charAt(i))) result += str.charAt(i);
//        }
//        return result;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))) result.append(str.charAt(i));
        }

        return result;
    }
}
