package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroesToEnd2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 17, 19, 0, 23, 0, 5, 0));
        System.out.println(moveZeroesToEnd(list));
    }

    public static List<Integer> moveZeroesToEnd(List<Integer> list){

        int initialSize = list.size();
        list.removeAll(Arrays.asList(0));
        int difference = initialSize - list.size();

        for(int i = 0; i < difference; i++){
            list.add(0);
        }
        return list;
    }
}
