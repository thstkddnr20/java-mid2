package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer i : myArray) { // 향상된 for문을 사용하려면 배열이거나 Iterable 인터페이스를 구현해야한다
            System.out.println(i);
        }
        //컴파일 시점에 위의 while문 처럼 변경시켜줌
    }
}
