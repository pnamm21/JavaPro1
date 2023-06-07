import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practise1 {
    public static void main(String[] args) {

    }

    public static List<Integer> createRandomList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        return list;
    }

    public static int findSumElemList(List<Integer> list) {
        System.out.println(createRandomList());
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int findAverageList(List<Integer> list) {
        System.out.println(createRandomList());
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public static void findSmallNumberList(List<Integer> list) {
        System.out.println(createRandomList());
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Наименьший элемент в списке: " + min);
    }

    public static void finBigNumberList(List<Integer> list) {
        System.out.println(createRandomList());
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("The Biggest Number is " + max);
    }

    public static void countEvenNumberList(List<Integer> list) {
        System.out.println(createRandomList());
        int even = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even++;
            }
        }
        System.out.println("Amount of even number: " + even);
    }

    public static void countNumbersList(List<Integer> list, int num) {
        System.out.println(createRandomList());
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > num) {
                count++;
            }
        }
        System.out.println("" + count);
    }

    public static boolean checkNumberArrayList(List<Integer> list, int n) {
        System.out.println(createRandomList());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return true;
            }
        }
        return false;
    }

    public static int findSecondLargeList(List<Integer> list) {
        System.out.println(createRandomList());
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > large1) {
                large2 = large1;
                large1 = list.get(i);
            } else if (list.get(i) > large2 && list.get(i) != large1) {
                large2 = list.get(i);
            }
        }
        return large2;
    }

    public static boolean checkArrayList(List<Integer> list) {
        System.out.println(createRandomList());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void checkArrayGoUpOrDownList(List<Integer> list) {
        System.out.println(createRandomList());
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                inc = false;
                break;
            }
            if (list.get(i) > list.get(i - 1)) {
                dec = false;
                break;
            }
        }

        if (inc) {
            System.out.println("Список является возрастающим.");
        } else if (dec) {
            System.out.println("Список является убывающим.");
        } else {
            System.out.println("Список не является монотонным.");
        }

    }

    public static void findSumElemAtEvenPositList(List<Integer> list) {
        System.out.println(createRandomList());
        int sum = 0;
        for (int i = 0; i < list.size(); i += 2) {
            sum += list.get(i);
        }
        System.out.println();
    }

    public static void findMultiOddPositList(List<Integer> list) {
        System.out.println(createRandomList());
        int multi = 0;
        for (int i = 1; i < list.size(); i += 2) {
            multi *= list.get(i);
        }
        System.out.println(multi);
    }

    public static void findSmallDif(List<Integer> list) {
        System.out.println(createRandomList());
        int dif = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            dif = list.get(i) - list.get(list.size() - i - 1);
        }
        System.out.println(dif);
    }

    public static boolean checkSubArraySumList(List<Integer> list,int targetSum) {
        int currentSum = 1;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < list.size(); endIndex++) {
            currentSum += list.get(endIndex);
            while (currentSum > targetSum && startIndex <= endIndex) {
                currentSum -= list.get(startIndex);
                startIndex++;
            }
            if (currentSum == targetSum) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkSubArrayList(List<Integer> list,int target){
        if (target == 0) {
            // Если целевое произведение равно 0, ищем подмассив с нулевым элементом
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    return true;
                }
            }
            return false;
        }

        int currentProduct = 1;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < list.size(); endIndex++) {
            currentProduct *= list.get(endIndex);

            while (currentProduct > target && startIndex <= endIndex) {
                currentProduct /= list.get(startIndex);
                startIndex++;
            }

            if (currentProduct == target) {
                return true;
            }
        }

        return false;
    }

}
