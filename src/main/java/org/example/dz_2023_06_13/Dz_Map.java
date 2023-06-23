package org.example.dz_2023_06_13;

import java.util.*;

public class Dz_Map {
//    * 5.Получить все ключи Map<Integer, Boolean>, у которых значение равно true, и вернуть их в виде списка.
//            * public static List<Integer> findTrueKeys(Map<Integer, Boolean> inputMap)

    public static List<Integer> findTrueKeys(Map<Integer, Boolean> inputMap) {
        List<Integer> trueKeys = new ArrayList<>();
        for (Map.Entry<Integer, Boolean> entry : inputMap.entrySet()) {
            if (entry.getValue()) {
                trueKeys.add(entry.getKey());
            }
        }
        return trueKeys;
    }


//* 3.Проверить, все ли значения в Map<Integer, Boolean> равны true.
//            * public static boolean allValuesTrue(Map<Integer, Boolean> inputMap)

    public static boolean allValuesTrue(Map<Integer,Boolean> inputMap){
        for (boolean value: inputMap.values()) {
            if (!value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(2, false);
        map.put(3, true);
        map.put(4, false);
        map.put(5, true);

        List<Integer> trueKeys = findTrueKeys(map);
        System.out.println(trueKeys);

        Map<Integer,Boolean> map1 = new HashMap<>();
        map1.put(1,true);
        map1.put(2,true);
        map1.put(3,true);
        System.out.println(allValuesTrue(map1));

        Map<Integer,Boolean> map2 = new HashMap<>();
        map2.put(1,true);
        map2.put(2,false);
        map2.put(3,true);
        System.out.println(allValuesTrue(map2));

    }
}

