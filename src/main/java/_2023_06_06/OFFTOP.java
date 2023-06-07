package _2023_06_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class OFFTOP {
    private static Set<Integer> hasDuplicated(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int j:array) {
            set.add(j);
        }
        return set;
    }

//    private static Set<Integer> unique1(int[] array){
//        Arrays.stream(array).distinct();
//    }

    public static void main(String[] args) {

    }
}
