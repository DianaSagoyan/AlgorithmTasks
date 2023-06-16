package pyramid_patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 9;
        System.out.println(printTriangle(rows));
    }

    public static String printTriangle(int rows){

        String result = "";

        for (int i = 1; i < rows; i++) {
            int space = (rows - i) / 2;

            while (space > 0){
                result += " ";
                space--;
            }

            for (int j = i; j > 0 ; j--) {
                result += i - j + 1 + " ";
            }
            result += "\n";
        }

        return result;

    }
}
