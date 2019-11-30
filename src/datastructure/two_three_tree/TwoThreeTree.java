package datastructure.two_three_tree;

public class TwoThreeTree <T extends Comparable>{
    Node root;
    int size;
    private class Node {
        T[] children;
        Node parent;

        public Node() {
            this.children = (T[])new Object[4];
        }
    }


    public void add(T item){
        if(this.root == null){
            this.root = new Node();
        }else{
        }
    }

    private void add(Node addNode, T item){

    }
}
