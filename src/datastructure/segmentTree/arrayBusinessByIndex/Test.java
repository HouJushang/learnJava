package datastructure.segmentTree.arrayBusinessByIndex;


public class Test {
    public static void main(String[] args) {
        Integer[] temp = {1, 2, 3, 4, 5, 6};
        SegmentTree<Integer> tree = new SegmentTree<>(temp, (a, b) -> a + b);
        int a = tree.query(0, 6);
        System.out.println(a);
    }
}
