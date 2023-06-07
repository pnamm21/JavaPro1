package _2023_06_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("QQ");
        list.add("DD");
        list.add("SS");
        list.add("RR");
        list.add("WW");

//        System.out.println(list);

        // move from start to end
        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator(list.size()/2);
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        // QQ DD SS RR WW
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);


    }
}
