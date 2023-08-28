package dsa_algos;

public class Task69_SumOfTwoIntegers {
    public static void main(String[] args) {
        //Given two integers a and b, return the sum of the two integers without using the operators + and -.
        int a = 2, b = 3;

        System.out.println(sumOfTwoIntegers(a,b));
    }

    //Using Bitwise operators
    public static int sumOfTwoIntegers(int a, int b){
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
