package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);

        //같은 키에 저장 시 기존 값 교체
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean contains = studentMap.containsKey("studentA");
        System.out.println("contains = " + contains);

        // 특정 학생 값 삭제
        Integer removed = studentMap.remove("studentA");
        System.out.println(studentMap);
        System.out.println("removed = " + removed);
    }
}
