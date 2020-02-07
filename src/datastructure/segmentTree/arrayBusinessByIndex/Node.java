package datastructure.segmentTree.arrayBusinessByIndex;

public class Node<E> {
    E val;
    int l;
    int r;
    int mid;

    public Node(E val, int l, int r, int mid) {
        this.val = val;
        this.l = l;
        this.r = r;
        this.mid = mid;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
