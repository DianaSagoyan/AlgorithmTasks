package tasks;

public class LengthOfLastWord2 {
    public static void main(String[] args) {
        String str = " fly me to the moon     ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str){
        int p = str.length() - 1;
        while (p >= 0 && str.charAt(p) == ' ') {
            p--;
        }

        int length = 0;
        while (p >= 0 && str.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }
}
