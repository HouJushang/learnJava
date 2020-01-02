package sort;

public abstract class SortTemplate {
    public static Comparable[] sort(Comparable[] arr){
        return null;
    };

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    };

    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(Comparable[] a){
        if (a.length <= 1) return true;
        for(int i = 1; i < a.length; i++){
            if(less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 2};
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
