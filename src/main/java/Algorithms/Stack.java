package Algorithms;

public class Stack {

    private int[] stack;
    private int index = 0;

    public void growSize() {
        int[] newArr = new int[this.stack.length * 2];
        System.arraycopy(newArr, 0, this.stack, 0, this.stack.length * 2);
//        this.stack = newArr;
    }

    public Stack() {
        this.stack = new int[10];
//        this.index = 0;
    }

    public Stack(int size) {
        this.stack = new int[size];
//        this.index = 0;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void push(int item) {
        if (index > stack.length - 1) {
            growSize();
        }
        stack[index++] = item;
    }

    public Integer pop(){
        if (!isEmpty()){
            return stack[--index];
        }
        return null;
    }
}

class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.push(6);
        stack.push(4);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
