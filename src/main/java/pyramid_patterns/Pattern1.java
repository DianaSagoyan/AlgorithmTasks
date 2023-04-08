package pyramid_patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 9;

        String result = "";
        for (int i = 0; i < num; i++) {
            int space = (num - i) / 2;
            while (space > 0){
                result += " ";
                space--;
            }
            for (int j = i + 1; j > 0; j--) {
                result += i + 1 + " ";
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
