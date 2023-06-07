package _2023_05_30;

import java.util.ArrayList;
import java.util.List;

public class Collections_Arrays {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        int[] a = new int[10];
        list.add(5);
        list.add(13);
        list.add(23);
        list.add(31);
        System.out.println(list.contains(13));
        System.out.println(list);
    }

}


