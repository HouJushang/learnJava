package datastructure.segmentTree.arraySumByIndex;

public class SegmentTree {

    private Integer[] data;

    private Node[] tree;

    public SegmentTree(Integer[] arr) {
        this.data = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.data[i] = arr[i];
        }

        this.tree = new Node[4 * arr.length];

        buildSegmentTree(0, 0, this.data.length - 1);
    }

    public int getSize() {
        return this.data.length;
    }

    public Integer get(int index){
        if(index < 0 || index >= this.data.length)
            throw new IllegalArgumentException("Index is illegal");
        return this.data[index];
    }

    public int query(int queryL, int queryR) {
        return queryFn(0, queryL, queryR);
    }

    private int queryFn(int treeIndex, int queryL, int queryR){
        Node node = this.tree[treeIndex];
        int l = node.getL();
        int r = node.getR();

        if(l == r){
            return node.getVal();
        }
        int mid = node.getMid();

        if(queryL <= mid && queryR <= mid){
            return queryFn(leftChild(treeIndex), queryL, queryR);
        }

        if(queryL <= mid && queryR > mid){
            return queryFn(leftChild(treeIndex), queryL, mid) + queryFn(rightChild(treeIndex), mid + 1, queryR);
        }

        if(queryL > mid && queryR > mid){
            return queryFn(rightChild(treeIndex), queryL, queryR);
        }

        throw new IllegalArgumentException("queryL or queryR is illegal");
    }

    private int leftChild(int index){
        return  index * 2 + 1;
    }

    private int rightChild(int index){
        return index * 2 + 2;
    }

    private void buildSegmentTree(int index, int l, int r) {
        if(l == r){
            this.tree[index] = new Node(this.data[l], l, r, l);
            return;
        }

        int mid = l + (r - l) / 2;
        int leftTreeIndex = leftChild(index);
        int rightTreeIndex = rightChild(index);

        buildSegmentTree(leftTreeIndex, l, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, r);

        Node node = new Node(this.tree[leftTreeIndex].getVal() + this.tree[rightTreeIndex].getVal(), leftTreeIndex, rightTreeIndex, mid);
        this.tree[index] = node;
    }
}
