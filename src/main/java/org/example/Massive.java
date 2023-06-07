package org.example;

public class Massive {
    // Task 4
//        //Проверить, является ли заданный одномерный массив симметричным
//        // (элементы симметрично расположены относительно центра).

    private static boolean isSymmetric(int[] arr3){
        boolean result = false;
        for (int i = 0; i < arr3.length/2; i++) {
            if (arr3[i]==arr3[arr3.length-1-i]){
                result=true;
            }else{
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={4,6,2,8,9,4,5,6};
        Massive mas = new Massive();
        mas.isSymmetric(arr);
        System.out.println(isSymmetric(arr));
    }




}
