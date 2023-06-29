package Algorithms;

public class DynamicArray {

    private Object[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        array = new Object[10];
        size = 0;
        capacity = 10;
    }

    public DynamicArray(int capacity) {
        array = new Object[capacity];
        size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove() {
        if (!this.isEmpty()) {
            array[size - 1] = null;
        } else {
            System.out.println("Remove not avail array is empty");
        }
    }

    public void clean() {
        size = 0;
    }


}
