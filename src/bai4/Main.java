package bai4;

import java.util.Arrays;

import static bai4.Search.search;

public class Main {
    public static void main(String[] args) {
        int[] array = {23,54,76,12,3,87,34,2};
        Arrays.sort(array);

        System.out.println("Tìm kiếm 23 :" +search(array, 0, array.length - 1, 23) );

    }
}
