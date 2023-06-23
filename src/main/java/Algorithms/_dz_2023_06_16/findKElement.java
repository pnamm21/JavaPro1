package Algorithms._dz_2023_06_16;

public class findKElement {

    public static int findKElement(int[] arr1, int[] arr2, int k) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        int kthElement = 0;
        if (k <= 0 || k > m + n) {
            throw new IllegalArgumentException("Not correct value of k");
        }
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                kthElement = arr1[i];
                i++;
            } else {
                kthElement = arr2[j];
                j++;
            }
            if (i + j == k) {
                break;
            }
        }
        while (i < m && i + j < k) {
            kthElement = arr1[i];
            i++;
        }
        while (j < n && i + j < k) {
            kthElement = arr2[j];
            j++;
        }
        return kthElement;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int kElement = findKElement(arr1,arr2,k);
        System.out.println("Kth elem: " + kElement);
    }
}
