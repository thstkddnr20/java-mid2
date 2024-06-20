package collection.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayMain2 {
    public static void main(String[] args) {

        List<Integer> integers = new LinkedList<>();

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        //배열의 첫번째 위치에 추가
        //기본 배열의 데이터를 한칸 씩 밀고 배열의 첫번째 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        //index 위치에 추가
        //기본 배열의 데이터를 한 칸씩 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        for (int i = arr.length-2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
    }

    private static void addLast(int[] arr, int value) {
        arr[arr.length - 1] = value;
    }
}
