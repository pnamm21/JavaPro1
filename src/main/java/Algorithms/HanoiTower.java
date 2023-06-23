package Algorithms;

import java.util.Stack;

public class HanoiTower {

    // My way to make an Exercise
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

    // My way to make an Exercise
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

    // Teacher way to make an Exercise
    public static void hanoiTowerMy(int n, char fromRod, char toRod, char auxRod) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        int totalMoves = (int) (Math.pow(2, n) - 1);

        // Заполняем первый стержень дисками
        for (int i = n; i >= 1; i--) {
            stack1.push(i);
        }

        // Проверяем четность/нечетность количества дисков
        if (n % 2 == 0) {
            char temp = toRod;
            toRod = auxRod;
            auxRod = temp;
        }

        // Выполняем перемещение дисков
        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                moveDisk(stack1, stack2, fromRod, toRod);
            } else if (move % 3 == 2) {
                moveDisk(stack1, stack3, fromRod, auxRod);
            } else if (move % 3 == 0) {
                moveDisk(stack2, stack3, toRod, auxRod);
            }
        }
    }

    private static void moveDisk(Stack<Integer> source, Stack<Integer> destination, char sourceRod, char destinationRod) {
        int disk = source.pop();
        destination.push(disk);
        System.out.println("Move disk " + disk + " from " + sourceRod + " to " + destinationRod);
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
        System.out.println("My way to make an Exercise");
        System.out.println("With Recursive way");
        int moveCount = getHanoiTowerRecursive(3, 1, 2, 3);
        System.out.println("Total moves: " + moveCount);
        System.out.println("===========================================");
        System.out.println();
        System.out.println("With Iterative way");
        getHanoiTowerIterative(3, 1, 2, 3);
        System.out.println("===========================================");
        System.out.println("Teacher way to make an Exercise");
        int n = 3;
        char fromRod = 'A';
        char toRod = 'C';
        char auxRod = 'B';

        hanoiTowerMy(n, fromRod, toRod, auxRod);
    }
}
