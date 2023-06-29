package org.example._2023_06_27;

public class Lambda_Task {
    public static void main(String[] args) {
        sum(array -> {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        });
    }

    public static void sum(L1 l1) {
        int[] array = {1, 2, 3, 4};
        l1.getSum(array);
    }
}

@FunctionalInterface
interface L1 {
    void getSum(int[] array);

}
