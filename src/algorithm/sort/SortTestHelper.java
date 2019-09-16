package algorithm.sort;

import java.util.Random;

public class SortTestHelper {

    /**
     * 生成n个元素的随机数组
     * @param n
     * @param rangeL
     * @param rangeR
     * @return
     */
    public  static Integer[] generateRandomArray(int n, int rangeL, int rangeR){
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            Random r = new Random () ;
            arr[i] =  r.nextInt (rangeR + 1 - rangeL) + rangeL;
        }
        return arr;
    }
}
