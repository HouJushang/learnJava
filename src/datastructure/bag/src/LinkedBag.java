package datastructure.bag.src;

public class LinkedBag<T> implements IBag<T> {
    private Node firstNode;

    private int numberOfEntries = 0;

    class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public Boolean add(T newEntry) {
        firstNode = new Node(newEntry, firstNode);
        numberOfEntries++;
        return true;
    }

    @Override
    public T remove() {
        T result = null;

        if(firstNode != null){
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        }

        return result;

    }

    @Override
    public Boolean remove(T anEntry) {
        Node resultNode = getReferenceTo(anEntry);
        if(resultNode != null){
            resultNode.data = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void clear() {
        firstNode = null;
//        while (!isEmpty())
//            remove();
    }

    @Override
    public int getFrequencyOf(T entry) {
        int counter = 0;
        Node currentNode = firstNode;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < numberOfEntries){

            if(currentNode.data.equals(entry)) counter++;

            currentNode = currentNode.next;
            currentIndex++;

        }
        return counter;

    }

    @Override
    public boolean contains(T entry) {
        return getReferenceTo(entry) != null;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[])new Object[numberOfEntries];

        Node currentNode = firstNode;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < numberOfEntries){
            result[currentIndex] = currentNode.data;
            currentNode = currentNode.next;
            currentIndex++;
        }

        return result;
    }

    private Node getReferenceTo(T anEntry){
        Node currentNode = firstNode;
        boolean found = false;

        while (currentNode != null && !found){
            if(currentNode.data.equals(anEntry)){
                found = true;
            }else{
                currentNode = currentNode.next;
            }
        }

        return currentNode;

    }
}
