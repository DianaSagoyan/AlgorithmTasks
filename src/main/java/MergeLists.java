import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6));

//        for (int i = 0; i < list2.size(); i++) {
//            list1.add(list2.get(i));
//        }
//
        list1.addAll(list2);

        System.out.println(list1);
    }
}
