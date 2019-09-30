package sort.InsetionSort;

public class InsertionSort {
    public static <T extends Comparable> T[] sortFn(T[] arr) {
        sort(1, arr);
        return arr;
    }

    public static <T extends Comparable> void sort(int positionIndex, T[] arr) {
        if (positionIndex == arr.length) return;
        T temp =  arr[positionIndex];
        int i;
        for (i = positionIndex; i > 0 && arr[i - 1].compareTo(temp) > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = temp;
        sort(++ positionIndex, arr);
    }

    public static void main(String[] args) {
        Integer[] testArr = {2, 0, 1, 2, 3, 5, 1, 9, 8};
        sortFn(testArr);
        System.out.println(testArr.toString());
    }
}
