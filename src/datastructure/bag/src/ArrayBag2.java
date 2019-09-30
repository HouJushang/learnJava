//package datastructure.bag.src;
//
//import java.util.Arrays;
//
//public class ArrayBag2<T> implements IBag {
//    private T[] bag;
//    private int size;
//    private static final int CAPACITY = 20;
//
//    public ArrayBag2() {
//       this(CAPACITY);
//    }
//
//    public ArrayBag2(int size) {
//        this.bag = (T[]) new Object[size];
//    }
//
//    @Override
//    public int getCurrentSize() {
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    @Override
//    public void add(Object o) {
//        if(this.size == bag.length){
//            this.reSize();
//        }
//        bag[size] = (T)o;
//        size ++;
//    }
//
//    @Override
//    public T remove() {
//        return null;
//    }
//
//    @Override
//    public T remove(Object o) {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public int getFrequencyOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    private void reSize() {
//        T[] newBag = (T[]) new Object[this.bag.length * 2];
//        for (int i = 0; i < bag.length; i++) {
//            newBag[i] = this.bag[i];
//        }
//        this.bag = newBag;
//    }
//
//    @Override
//    public String toString() {
//        return "ArrayBag{" +
//                "datastructure.bag=" + Arrays.toString(bag) +
//                ", size=" + size +
//                '}';
//    }
//}
