package Algorithms;

public class HanoiTower {

    public static int getHanoiTowerRecursive(int n, int firstBar, int secondBar, int thirdBar) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + firstBar + " to " + thirdBar);
            return 1;
        }
        int count = 0;
        count += getHanoiTowerRecursive(n - 1, firstBar, thirdBar, secondBar);
        System.out.println("Move disk " + n + " from " + firstBar + " to " + thirdBar);
        count++;
        count += getHanoiTowerRecursive(n - 1, secondBar, firstBar, thirdBar);
        return count;
    }

    public static void getHanoiTowerIterative(int n, int firstBar, int secondBar, int thirdBar) {
        int moveCount = 0;
        Bar[] bars = new Bar[(int) (Math.pow(2, n) - 1)];
        int top = 0;
        bars[top] = new Bar(n, firstBar, secondBar, thirdBar);
        while (top >= 0) {
            Bar current = bars[top];
            top--;
            if (current.n == 1) {
                moveCount++;
                System.out.println("Move from " + current.firstBar + " to " + current.thirdBar);
            } else {
                top++;
                bars[top] = new Bar(current.n - 1, current.secondBar, current.firstBar, current.thirdBar);
                top++;
                bars[top] = new Bar(1, current.firstBar, current.secondBar, current.thirdBar);
                top++;
                bars[top] = new Bar(current.n - 1, current.firstBar, current.thirdBar, current.secondBar);
            }
        }
        System.out.println("Total moves: " + moveCount);
    }


    static class Bar {
        int n;
        int firstBar;
        int secondBar;
        int thirdBar;

        public Bar(int n, int firstBar, int secondBar, int thirdBar) {
            this.n = n;
            this.firstBar = firstBar;
            this.secondBar = secondBar;
            this.thirdBar = thirdBar;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("With Recursive way");
        int moveCount = getHanoiTowerRecursive(3, 1, 2, 3);
        System.out.println("Total moves: " + moveCount);
        System.out.println("===========================================");
        System.out.println();
        System.out.println("With Iterative way");
        getHanoiTowerIterative(3, 1, 2, 3);
    }
}
