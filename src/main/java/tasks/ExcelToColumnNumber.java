package tasks;

public class ExcelToColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "DCA";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle){

        int result = 0;
        int i = columnTitle.length() - 1;

        for (char ch : columnTitle.toCharArray()){
            result += (ch - 64) * Math.pow(26, i);
            i--;
        }

        return result;

    }
}
