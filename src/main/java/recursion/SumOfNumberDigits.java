package recursion;

public class SumOfNumberDigits {
    public static void main(String[] args) {
        int num = 493193;
        System.out.println("The sum of the digits of this " + num + " is " + sumOfDigits(num));
    }

    private static int sumOfDigits(int num){
        int sum = 0;

        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num = (num - digit) / 10;
        }

        if(sum > 9) sum = sumOfDigits(sum);

        return sum;
    }
}
