package numbers;

public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorialOfNumber(num));
    }

    public static int factorialOfNumber(int num){

        if(num == 1) return num;

        return num * factorialOfNumber(num- 1);
    }
}
