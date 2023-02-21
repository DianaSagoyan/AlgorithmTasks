package strings;

public class VowelsPresent {
    public static void main(String[] args) {
        String str = "vl";
        System.out.println(vowelIsPresent(str));
    }

    public static boolean vowelIsPresent(String str){
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < vowels.length; i++) {
            if(str.contains(vowels[i])) return true;
        }
        return false;
    }
}
