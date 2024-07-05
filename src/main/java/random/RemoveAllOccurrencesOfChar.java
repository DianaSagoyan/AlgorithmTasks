package random;

public class RemoveAllOccurrencesOfChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char ch = 'e';
        System.out.println(removeOccurrencesOfChar(str, ch));
    }

    private static String removeOccurrencesOfChar(String str, char ch){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) continue;
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
