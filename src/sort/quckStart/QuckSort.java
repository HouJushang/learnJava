package sort.quckStart;

public class QuckSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3};
        new QuckSort().sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void sort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) return;
        int p = partition(arr, leftIndex, rightIndex);
        sort(arr, leftIndex, p -1);
        sort(arr, p +1, rightIndex);
    }

    private int partition(int[] arr, int leftIndex, int rightIndex) {
        int p = leftIndex;
        int temp = arr[leftIndex];

        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if(arr[i] <= temp){
                swap(arr, i, p + 1);
                p ++;
            }
        }
        swap(arr, leftIndex, p);

        return p;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
