package random;

public class CalculateOccurenceOfNumber {
    public static void main(String[] args) {
        int digit = 3;
        int number = 873425;

        System.out.println(calculateOccurrence(digit, number));
    }

    public static int calculateOccurrence(int digit, int number){
        int count = 0;

        while (number > 0){
            int lastDigit = number % 10;

            if(lastDigit == digit) count++;

            number /= 10;
        }

        return count;
    }
}
