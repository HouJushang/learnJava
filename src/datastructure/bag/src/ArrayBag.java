package datastructure.bag.src;

public final class ArrayBag<T> implements IBag<T> {
    private T[] bag;
    private int numberOfEntries = 0;
    private static final int CAPACITY = 20;
    private static final int MAX_CAPACITY = 10000;
    private boolean initialized = false;

    public ArrayBag() {
        this(ArrayBag.CAPACITY);
    }

    public ArrayBag(int size) {
        if(size >= ArrayBag.MAX_CAPACITY){
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum");
        }
        this.bag = (T[]) new Object[size];
        initialized = true;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public Boolean add(Object o) {
        checkIniaitlized();
        if(this.isArrayFull()){
            return false;
        }else{
            bag[numberOfEntries] = (T)o;
            numberOfEntries ++;
            return true;
        }
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[this.numberOfEntries];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.bag[i];
        }
        return result;
    }


    @Override
    public T remove() {
        checkIniaitlized();
        T result = null;
        if(numberOfEntries > 0){
            this.removeEntry(numberOfEntries - 1);
        }
        return result;
    }

    @Override
    public Boolean remove(T entry) {
        int entryIndex = getIndexOf(entry);
        if(entryIndex > -1){
            this.removeEntry(entryIndex);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T entry) {
        checkIniaitlized();
        int counter = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if(entry.equals(this.bag[numberOfEntries])){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean contains(T entry) {
        checkIniaitlized();
        return getIndexOf(entry) > -1;
    }

    private Boolean isArrayFull() {
        return this.numberOfEntries >= bag.length;
    }

    private void checkIniaitlized() {
        if(!initialized) {
            throw new SecurityException("ArrayBag object is not iniaitlized prpperly.");
        }
    }

    private int getIndexOf(T anEntry){
        int where = -1;
        int index = 0;
        boolean found = false;
        while (!found && index < numberOfEntries){
            if(this.bag[index].equals(anEntry)){
                where = index;
                found = true;
            }
            index++;
        }
        return where;
    }

    private T removeEntry(int givenIndex){
        T reulst = null;
        if(!isEmpty() && givenIndex >=0){
            reulst = bag[givenIndex];
            bag[givenIndex] = null;
            bag[givenIndex] = bag[numberOfEntries - 1];
            numberOfEntries--;
        }
        return reulst;
    }


}
