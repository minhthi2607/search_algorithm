package bai4;

public class Search {
    static int search(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (value == array[mid]) return mid;
        if (value > array[mid]) return search(array, mid + 1, right, value);
        if (value < array[mid]) return search(array, left, mid - 1, value);
        return -1;
    }
}
