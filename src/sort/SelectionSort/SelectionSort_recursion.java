package sort.SelectionSort;

public class SelectionSort_recursion {
    public static <T extends Comparable> T[] sortFn(T[] arr) {
        sortFn(0, arr);
        return arr;
    }

    public static <T extends Comparable> void sortFn(int beginIndex, T[] arr){
        if(beginIndex == arr.length - 1) return;
        int minIndex = beginIndex;
        for (int i = beginIndex; i < arr.length; i++) {
            if(arr[i].compareTo(arr[minIndex]) < 0){
                minIndex = i;
            }
        }
        if(beginIndex != minIndex) {
            swap(beginIndex, minIndex, arr);
        };
        sortFn(++beginIndex, arr);
    }

    public static  <T extends Comparable> void swap(int index1, int index2, T[] arr){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static void main(String[] args) {
        Integer[] testArr = {0, 2, 5, 1, 4, 4};
        sortFn(testArr);
        System.out.println(testArr.toString());
    }
}
