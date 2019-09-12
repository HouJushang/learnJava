package book.sort;

public class SelectionSort_iteration {
    public static <T extends Comparable> T[] sortFn(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            sort(i, arr);
        }
        return arr;
    }

    public static  <T extends Comparable> void sort(int beginIndex, T[] arr) {
        int minIndex = beginIndex;
        for (int i = beginIndex; i < arr.length; i++) {
            if(arr[i].compareTo(arr[minIndex]) < 0){
                minIndex = i;
            }
        }
        if(beginIndex == minIndex) return;
        swap(beginIndex, minIndex, arr);
    }

    public static  <T extends Comparable> void swap(int index1, int index2, T[] arr){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] testArr = {0, 2, 5, 1, 4};
        sortFn(testArr);
        System.out.println(testArr.toString());
    }
}
