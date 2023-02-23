package numbers;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 124;
        System.out.println(sumOfAllDigits(num));
    }

    public static int sumOfAllDigits(int num){
        int result = 0;

        while (num > 0){
            result += num % 10;
            num /= 10;
        }

        return result;
    }
}
