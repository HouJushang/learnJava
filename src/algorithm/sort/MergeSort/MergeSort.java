package algorithm.sort.MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3};
        new MergeSort().sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 排序[l, r]
    public void sort(int[] arr, int first, int last){
        if(first >= last) return;
        int mid = (last + first)/2;
        sort(arr, first, mid);
        sort(arr, mid + 1, last);
        marge(arr, mid, first, last);
    }

    public void marge(int[] arr, int mid,  int first, int last) {
        int [] tempArr = new int[last - first + 1];
        int compareLeftIndex = first;
        int compareRightIndex = mid + 1;
        int tempIndex = 0;
        while (compareLeftIndex <= mid || compareRightIndex <= last){
            int tempLeft = compareLeftIndex, tempRight = compareRightIndex;
            if(tempLeft > mid){
                tempArr[tempIndex] = arr[tempRight];
                compareRightIndex ++;
            }else if(tempRight > last){
                tempArr[tempIndex] = arr[tempLeft];
                compareLeftIndex ++;
            }else if(arr[tempLeft] <= arr[tempRight]){
                tempArr[tempIndex] = arr[tempLeft];
                compareLeftIndex ++;
            }else if(arr[tempRight] < arr[tempLeft]){
                tempArr[tempIndex] = arr[tempRight];
                compareRightIndex ++;
            }
            tempIndex ++;
        }
        for (int i = 0; i < tempArr.length; i++) {
            arr[i + first] = tempArr[i];
        }
    }
}

