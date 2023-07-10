package Algorithms;

public class DynamicArray<T> {

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

    // вернет false, если в структуре есть элемент
    public boolean isEmpty() {
        return size == 0;
    }

    //добавляет в конец
    public void add(T data) {
        if (size == capacity) {
            growSize();
        }
        array[size] = data;
        size++;
    }

    //удаляет последний
    public void remove() {
        if (!this.isEmpty()) {
            array[size - 1] = null;
        } else {
            System.out.println("Remove not avail array is empty");
        }
    }

    //удаляет все элементы
    public void clean() {
        size = 0;
    }

    //удаляет по индексу
    public void removeAt(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            array[size] = null;
        }
    }

    //увеличивает размер
    private void growSize() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
    }

    //изменяет элемент
    public void set(int index, T data) {
        if (index >= 0 && index < size) {
            array[index] = data;
        }
    }

    //проверяет существует ли элемент
    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

}
