package datastructure.two_three_tree;

public class TwoThreeTree <T extends Comparable>{
    private class Node {
        T value1;
        T value2;
        Node left;
        Node middle;
        Node right;
        Node parent;

        public Node() {
        }

        public Node(T value1) {
            this.value1 = value1;
        }
    }
    int size;
    Node node;

    public void add(T item){
        if(this.node == null){
            this.node = new Node();
            this.node.value1 = item;
        }else{
            add(this.node, item);
        }
    }

    private void add(Node addNode, T item){

    }
}
