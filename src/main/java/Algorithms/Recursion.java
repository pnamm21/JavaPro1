package Algorithms;

public class Recursion {
//    public static int countConsonantIteration(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (isConsonant(str.charAt(i))) {
//                count++;
//            }
//        }
//        return count;
//    }
public static int countConsonantRecursive(String str) {
    if (str.length() == 0) {
        return 0;
    } else {
        int count = isConsonant(str.charAt(0)) ? 1 : 0;
        return count + countConsonantRecursive(str.substring(1));
    }
}

    private static boolean isConsonant(char charAt) {
        return true;
    }




    public static void main(String[] args) {
        System.out.println(countConsonantRecursive("amadam"));
    }
}
