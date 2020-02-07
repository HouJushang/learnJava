package datastructure.segmentTree.arrayBusinessByIndex;

public class SegmentTree<E> {

    private E[] data;

    private Node<E>[] tree;

    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger) {
        this.merger = merger;
        this.data = (E[])new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.data[i] = arr[i];
        }

        this.tree = new Node[4 * arr.length];

        buildSegmentTree(0, 0, this.data.length - 1);
    }

    public int getSize() {
        return this.data.length;
    }

    public E get(int index){
        if(index < 0 || index >= this.data.length)
            throw new IllegalArgumentException("Index is illegal");
        return this.data[index];
    }

    public E query(int queryL, int queryR) {
        if(queryL < 0 || queryR > this.data.length || queryR > queryL)
            throw new IllegalArgumentException("queryL or queryR is illegal");
        return queryFn(0, queryL, queryR);
    }

    private E queryFn(int treeIndex, int queryL, int queryR){
        Node node = this.tree[treeIndex];
        int l = node.getL();
        int r = node.getR();

        if(l == r){
            return (E)node.getVal();
        }
        int mid = node.getMid();

        if(queryL <= mid && queryR <= mid){
            return queryFn(leftChild(treeIndex), queryL, queryR);
        }

        if(queryL <= mid && queryR > mid){
            return merger.merge(queryFn(leftChild(treeIndex), queryL, mid), queryFn(rightChild(treeIndex), mid + 1, queryR));
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

        Node node = new Node(merger.merge(this.tree[leftTreeIndex].getVal(), this.tree[rightTreeIndex].getVal()), leftTreeIndex, rightTreeIndex, mid);
        this.tree[index] = node;
    }
}
