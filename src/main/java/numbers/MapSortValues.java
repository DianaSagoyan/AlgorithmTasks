package numbers;

import java.util.*;

public class MapSortValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(Map.of("a", 17, "b", 5, "c", 20, "d", 12, "e", 70));
        System.out.println(sortMapValues(map));

    }

    public static Map<String, Integer> sortMapValues(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}
