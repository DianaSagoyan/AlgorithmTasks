package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 4, 300, 230, 47));
        int num = 100;
        System.out.println(removeNumbersBiggerThan(numbers, num));
    }

    public static List<Integer> removeNumbersBiggerThan(List<Integer> numbers, int num){

//        return numbers.stream().filter(number -> number < num).collect(Collectors.toList());

//        List<Integer> result = new ArrayList<>();
//
//        for(Integer number: numbers){
//            if(number < num) result.add(number);
//        }
//        return result;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 100) numbers.remove(i);
        }
        return numbers;
    }
}
