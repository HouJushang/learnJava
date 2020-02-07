package datastructure.segmentTree.arraySumByIndex;


public class Test {
    public static void main(String[] args) {
        Integer[] temp = {1, 2, 3, 4, 5, 6};
        SegmentTree tree = new SegmentTree(temp);
        int a = tree.query(0, 6);
        int c = tree.query(-1, 2);
        System.out.println(a);
        System.out.println(c);
    }
}
