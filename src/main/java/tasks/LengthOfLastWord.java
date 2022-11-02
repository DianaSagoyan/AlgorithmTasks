package tasks;

import java.util.NoSuchElementException;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " fly me to the moon     ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str) {
        if (str.length() == 0) throw new NoSuchElementException("String is empty");
        int length = 0;
        int firstChar = 0;
        int space = 0;

        for (int i = str.length() - 1; i > 0; i--) {
          if(Character.isLetter(str.charAt(i)) && firstChar == 0 && str.length() != 1){
              firstChar = i;
          }
        }

        for (int i = str.length() - 1; i > 0; i--) {
            if(!Character.isLetter(str.charAt(i)) && i > firstChar) continue;
            else if (Character.isLetter(str.charAt(i))) {
                length++;
            } else if(!Character.isLetter(str.charAt(i))){
                break;
            }
        }
        return length;
    }
}
