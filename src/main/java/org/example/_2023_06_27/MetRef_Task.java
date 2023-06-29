package org.example._2023_06_27;

public class MetRef_Task {
    public static void main(String[] args) {
        r3(MetRef_Task::result);
    }

    public static void r3(L2 l2) {
        int[] array = {1, 2, 3, 4, 5};
        l2.getSum(array);
    }

    public static void result(int[] array){
        int s = 0;
        for (int i = 0; i <array.length; i++) {
            s += array[i];
        }
        System.out.println(s);
    }
}

@FunctionalInterface
interface L2 {
    void getSum(int[] array);
}
