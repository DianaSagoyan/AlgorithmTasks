package random;

// StRinG --> sTrINg

public class ToggleCharacters {
    public static void main(String[] args) {
        String str = "STRinG";
        System.out.println(toggleString(str));
    }

    public static String toggleString(String str){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) result.append(Character.toLowerCase((str.charAt(i))));
            else result.append(Character.toUpperCase(str.charAt(i)));
        }

        return new String(result);
    }
}
