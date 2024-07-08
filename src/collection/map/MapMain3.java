package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();


        studentMap.put("studentA", 50);
        System.out.println("studentMap = " + studentMap);

        // studentA가 없는 경우에만 값을 넣음
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println("studentMap = " + studentMap);


    }
}
