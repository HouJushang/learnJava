package demo.ad;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 7, 8, 1, 10, 9};
        fastSort(arr, 0, arr.length - 1);
    }

    private static void fastSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = handler(arr, l, r);
        fastSort(arr, l, p - 1);
        fastSort(arr, p + 1, r);
    }

    private static int handler(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = l; i <= r; i++) {
            if (arr[i] < v) {
                swap(arr, i, j + 1);
                j++;
            }
        }
        swap(arr, j, l);
        return j;
    }

    private static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

}
