package dataStructure.bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST<T extends Comparable<T> > {
    private class Node{
        public T t;
        public Node left, right;

        public Node(T t) {
            this.t = t;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(T t){
        root = add(root, t);
    }

    private Node add(Node node, T t){
        if(node == null){
            size++;
            return new Node(t);
        }
        if(t.compareTo(node.t) < 0)
            node.left = add(node.left, t);
        else
            node.right = add(node.right, t);

        return node;
    }

    public boolean contains(T t){
        return  contains(root, t);
    }

    private boolean contains(Node node, T t){
        if(node == null) return false;
        if(t.compareTo(node.t) == 0)
            return true;
        else if(t.compareTo(node.t) < 0)
            return contains(node.left, t);
        else
            return contains(node.right, t);
    }

    // 前序遍历
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null) return;
        System.out.println(node.t);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 中序遍历(排序)
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.t);
        inOrder(node.right);
    }

    // 后序遍历
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.t);
    }

    // 非递归遍历
    public void preorderNf(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.t);
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);
        }
    }

    // 层序遍历
    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node cur = q.remove();
            System.out.println(cur.t);
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
    }

    // 获取最小值
    public T minimum() {
        if(size == 0)
            throw new IllegalArgumentException("BST is empty");
        return minimum(root).t;
    }
    private Node minimum(Node node){
        if(node.left == null) return node;
        return minimum(node.left);
    }

    // 删除最小值
    public T removeMin() {
        T ret = minimum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node){
        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    // 删除任意节点

    // 获取最大值 删除最大值
}
