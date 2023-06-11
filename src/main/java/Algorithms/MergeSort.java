package Algorithms;

    public class MergeSort {
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }

            int n = arr.length;
            int[] temp = new int[n];
            int blockSize = 1;

            while (blockSize < n) {
                for (int start = 0; start < n - blockSize; start += 2 * blockSize) {
                    int mid = start + blockSize - 1;
                    int end = Math.min(start + 2 * blockSize - 1, n - 1);
                    merge(arr, temp, start, mid, end);
                }
                blockSize *= 2;
            }
        }
        private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
            int i = start;
            int j = mid + 1;
            int k = start;

            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j <= end) {
                temp[k++] = arr[j++];
            }

            for (k = start; k <= end; k++) {
                arr[k] = temp[k];
            }
        }
        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 12, 3};
            mergeSort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

