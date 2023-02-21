package numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(numberIsPrime(num));
    }

    public static boolean numberIsPrime(int num){

        if(num == 0 || num == 1) return false;

        if(num == 2) return true;

        for (int i = 2; i < num / 2; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
